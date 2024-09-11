package learn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;


public class Jdbc01 {
    public static void main(String [] args) throws SQLException{
        // 注册驱动
        Driver driver=new Driver();
        // 得到连接
        // (1) jdbc:mysql: 规定好的协议，表示通过jdbc的方法连接mysql
        // (2) losthost: 主机，可以是ip地址
        // (3) 3306: mysql服务监听的端口
        // (4) db01: 连接到mysql 的哪个数据库
        // (5) mysql的本质就是前面学过的socket连接
        String url="jdbc:mysql://localhost:3306/db01";
        // 将用户名和密码放入到Properties对象中
        Properties properties=new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");

        Connection connect= driver.connect(url, properties);
        // 执行sql
        String sql="Update users set name='123' where id=1";
        // Statement 用于执行静态sql语句并返回其生成的结果对象
        Statement statement=connect.createStatement();
        int rows=statement.executeUpdate(sql); // 如果是dml语句，返回的就是影响行数
        System.out.println(rows>0?"success":"fail");
        
        // 关闭连接
        statement.close();
        connect.close();
    }
}

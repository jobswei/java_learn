package learn.jdbc;

import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import org.junit.Test;

public class jdbcConn {
    
    // 方式1
    @Test 
    public void connection01() throws SQLException,NoSuchMethodException, SecurityException,InstantiationException,IllegalAccessException{
        Driver driver = new Driver();
        String url="jdbc:mysql://localhost:3306/db01";
        Properties properties=new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connection=driver.connect(url, properties);
        System.out.println(connection);
        connection.close();
    }

    // 方式2：反射连接
    public void connection02() throws ClassNotFoundException{
        // 使用反射加载java 类, 动态加载，更加灵活，减少了依赖性
        Class<?> aClass=Class.forName("come.mysql.jdbc.Driver");
        Driver driver=(Driver)aClass.getDeclaredConstructor().newInstance();

    }
}

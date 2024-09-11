package learn.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // 读取properties文件，获取相关信息
        Properties properties=new Properties();
        properties.load(new FileReader("D://About_coding/java/learn/file/mysql.properties"));
        // 把键值对显示到控制台
        properties.list(System.out);
        // 获取指定的值
        String user=properties.getProperty("user");
        String pwd=properties.getProperty("pwd");
        System.out.println("user= "+user+"\tpwd= "+pwd);

        // 创建Properties文件
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "老韩");
        // 如果是中文，那么保存的是unicode码
        properties.setProperty("pwd", "12323");
        properties.store(new FileOutputStream("D://About_coding/java/learn/file/mysql.properties"),"hello world");

        // 键值对修改
        // setProperties，如果没有这个key，就是创建，如果有这个key，就是修改
        properties.setProperty("pwd2", "12323");
        properties.store(new FileOutputStream("D://About_coding/java/learn/file/mysql.properties"),"hello world");
        

    }
}

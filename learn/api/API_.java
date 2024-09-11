package learn.api;
// 演示InetAddress类的使用

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException{
        // 获取本机的InetAddress对象
        InetAddress localHost= InetAddress.getLocalHost();
        System.out.println(localHost);
        // 根据指定的主机名，获取InetAddress对象
        InetAddress host1=InetAddress.getByName("LAPTOP-H29IGOJ6");
        System.out.println("host1= "+host1);
        // 根据域名获取Inet对象
        InetAddress host2=InetAddress.getByName("www.baidu.com");
        System.out.println("host2= "+host2);
        // 通过Inet对象，获取对应的地址
        String host2Address=host2.getHostAddress();
        System.out.println("host2 address= "+host2Address);
        // 通过Inet对象，获取对应的主机名/域名
        String host2Name=host2.getHostName();
        System.out.println("host2 name= "+host2Name);

    }
}

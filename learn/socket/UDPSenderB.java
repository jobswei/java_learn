package learn.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSenderB {
    public static void main(String [] args) throws IOException, SocketException,UnknownHostException{
        // 创建DatagramSocket对象，准备接收数据
        DatagramSocket socket=new DatagramSocket(9998);
        byte[] buf="hello, huoguo this n ight!".getBytes();
        DatagramPacket packet=new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),9999);
        socket.send(packet);

        byte[] data=new byte[64*1024];
        DatagramPacket packet2=new DatagramPacket(data,data.length);
        socket.receive(packet2);
        System.out.println(new String(packet2.getData(),0,packet2.getLength()));

        socket.close();

    }
}

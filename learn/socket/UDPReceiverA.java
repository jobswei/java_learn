package learn.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws SocketException,IOException{
        //1.创建一个DatagramSocket对象，准备在9999端口接收数据        
        DatagramSocket datagramSocket=new DatagramSocket(9999);
        //2.构建一个DatagramPacket，准备接收
        byte[] buf=new byte[64*1024];// UDP一个数据包最大是64KB
        DatagramPacket datagramPacke = new DatagramPacket(buf, buf.length);
        //3.调用接受方法
        System.out.println("Waiting for data");
        datagramSocket.receive(datagramPacke);
        
        //4.可以把packet进行拆包，取出数据并显示
        int length=datagramPacke.getLength();//实际接收到的数据长度
        byte[] data=datagramPacke.getData();//接收到的数据
        String s=new String(data,0,length);
        System.out.println(s);

        byte[] data2="OK,see you tomorrow!".getBytes();
        DatagramPacket packet=new DatagramPacket(data2, data2.length,InetAddress.getLocalHost(),9998);
        datagramSocket.send(packet);
        
        datagramSocket.close();
    }
}

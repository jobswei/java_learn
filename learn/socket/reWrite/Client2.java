package learn.socket.reWrite;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client2 {
    public static void main(String []args) throws IOException,SocketException{
        DatagramSocket dgs=new DatagramSocket(9998);

        byte[] buf="Hello!".getBytes();
        DatagramPacket dgp=new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(),9999);
        dgs.send(dgp);

        dgp=new DatagramPacket(buf,buf.length);
        dgs.receive(dgp);
        int len=dgp.getLength();
        System.out.println(new String(buf,0,len));

        dgs.close();
    }
    
}

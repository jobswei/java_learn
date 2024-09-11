package learn.socket.reWrite;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server2 {
    public static void main(String []args) throws IOException,SocketException{
        DatagramSocket dgs=new DatagramSocket(9999);

        byte[] buf=new byte[64*1024];
        DatagramPacket dgp=new DatagramPacket(buf, buf.length);

        dgs.receive(dgp);

        int len=dgp.getLength();
        System.out.println(new String(dgp.getData(),0,len));

        byte[] buf2="Fuck you!".getBytes();
        dgp=new DatagramPacket(buf2, buf2.length, InetAddress.getLocalHost(), 9998);
        dgs.send(dgp);

        dgs.close();


    }
}

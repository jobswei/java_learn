package learn.socket.exercises;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import org.junit.Test;

public class hmk22 {
    @Test
    public void sss() throws IOException{
        DatagramSocket socket = new DatagramSocket(1234);

        byte[] buf="四大名著是谁".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),8888);
        socket.send(packet);

        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));

        socket.close();
    }
}

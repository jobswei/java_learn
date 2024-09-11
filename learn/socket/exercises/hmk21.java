package learn.socket.exercises;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import org.junit.Test;

public class hmk21 {
    @Test
    public void ss() throws SocketException,IOException{
        DatagramSocket socket=new DatagramSocket(8888);

        byte[] buf = new byte[66*1024];  // 能全部盛下就行。如果不能全部盛下，就要是3的倍数的长度。否则会错误截断导致编码出错
        DatagramPacket packet=new DatagramPacket(buf,buf.length );
        socket.receive(packet);
        
        String str=new String(packet.getData(),0,packet.getLength());
        System.out.println(packet.getLength());
        System.out.println(str);
        if(true){
            buf="红楼梦，水浒传，三国演义，西游�??".getBytes();

        }else{
            buf="what?".getBytes();
        }

        packet=new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),1234);
        socket.send(packet);
        socket.close();

    }
    
}

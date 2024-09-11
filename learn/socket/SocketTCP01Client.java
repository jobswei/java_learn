package learn.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException{
        //1. 连接服务器
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("Client socket= "+socket.getClass());

        //2. 
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());
        // 关闭流对象和socket，否则造成资源浪费
        socket.shutdownOutput(); // 结束标记
        
        InputStream inputStream=socket.getInputStream();
        byte[] buf=new byte[1024];
        int readLen=0;
        while((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        socket.shutdownInput();

        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("Client shut down.");

    }
}

package learn.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String [] args) throws IOException{
        // 1. 在本机9999端口监听
        // 要求本机没有其他程序在9999端口
        // 一个serversocket可以通过accept()返回多个socket, 用来处理多连接
        ServerSocket serverSocket=new ServerSocket(9999);
        // 2. 当没有客户端连接9999端口时，程序会阻塞，等待连接
        // 如果有客户端连接，则返回socket对象，程序继续
        Socket socket=serverSocket.accept();
        System.out.println("socket= "+socket.getClass());
        InputStream inputStream=socket.getInputStream();
        // IO读取
        byte[] buf=new byte[1024];
        int readLen=0;
        while((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen)); // 根据读取到的实际长度，显示内容

        }
        
        socket.shutdownInput();
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("hello client".getBytes());
        socket.shutdownOutput();
        
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();

    }
}

package learn.socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server {
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
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        String read=bufferedReader.readLine();
        System.out.println(read);
         
        OutputStream outputStream=socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        
        bufferedWriter.close();
        bufferedReader.close();// 直接关闭外侧就可以了
        
        socket.close();
        serverSocket.close();

    }
}

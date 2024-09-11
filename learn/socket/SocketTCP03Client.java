package learn.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

// 使用字符流
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException{
        //1. 连接服务器
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("Client socket= "+socket.getClass());

        //2. 
        OutputStream outputStream = socket.getOutputStream();
        // 字节流转字符流
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello server, string stream");
        bufferedWriter.newLine();// 插入一个换行符，表示写入内容结束
        bufferedWriter.flush();// 使用字符流要手动刷新，否则数据不会写入数据通道
        // newLine已经表示结束，不用再加结束标记。
        // 此外，newline要求对方也要用readline接收

        InputStream inputStream=socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        String read = bufferedReader.readLine();
        System.out.println(read);

        bufferedReader.close();// 直接关闭外侧就可以了
        bufferedWriter.close();
        socket.close();
        System.out.println("Client shut down.");

    }
}

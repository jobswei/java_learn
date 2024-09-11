package learn.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

import learn.hsptools.*;
public class SocketTCP04Client {
    public static void main(String [] args) throws IOException,Exception{
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);

        // 发送数据
        String filePath="D://About_coding/java/learn/socket/files/index.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        // bytes 就是file对应的字节数组
        byte[] bytes=StreamUtils.streamToByteArray(bufferedInputStream);
        // 打过去
        OutputStream outputStream=socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(bytes);
        bufferedInputStream.close();
        socket.shutdownOutput();

        // 接受反馈
        InputStream inputStream=socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        String s=bufferedReader.readLine();
        System.out.println(s);

        bufferedOutputStream.close();
        bufferedReader.close();
        socket.close();


    }
}

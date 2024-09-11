package learn.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import learn.hsptools.StreamUtils;

import java.io.IOException;
public class SocketTCP04Server  {
    public static void main(String [] args) throws IOException,Exception{
        ServerSocket serverSocket=new ServerSocket(8888);
        System.out.println("Server is listening at port 8888");
        Socket socket=serverSocket.accept();
        // 等待接收数据
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        byte[] bytes=StreamUtils.streamToByteArray(bis);
        String s="D://About_coding/java/learn/socket/files/index copy.jpg";
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(s));
        bos.write(bytes);
        bos.close();


        OutputStream outputStream=socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Received successfully!");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bis.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();

    }
}

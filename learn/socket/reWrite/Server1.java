package learn.socket.reWrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.UnknownServiceException;
import java.net.Socket;
public class Server1 {
    public static void main(String [] ags) throws UnknownServiceException,IOException{
        ServerSocket server = new ServerSocket(6666);

        Socket socket=server.accept();
        System.out.println(socket.getClass());
        InputStream ins=socket.getInputStream();
        // byte[] bits = new byte[1024];
        // int len=0;
        // while((len=ins.read(bits))!=-1){
        //     System.out.println(new String(bits,0,len));
        // }
        // socket.shutdownInput();
        BufferedReader bur=new BufferedReader(new InputStreamReader(ins));
        System.out.println(bur.readLine()); // 用newLine写的必须用readLine接收，不然不行！
        

        // OutputStream ous=socket.getOutputStream();
        // byte[] outbits="OK".getBytes();
        // ous.write("OK".getBytes());
        // System.out.println("Finished");
        // socket.shutdownOutput();
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("hello client".getBytes());
        socket.shutdownOutput();

        ins.close();
        outputStream.close();
        socket.close();
        server.close();

    }
}

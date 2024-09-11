package learn.socket.reWrite;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownServiceException;
public class Client1 {
    public static void main(String [] args) throws IOException,UnknownServiceException{

        Socket client=new Socket(InetAddress.getLocalHost(),6666);

        OutputStream ous = client.getOutputStream();
        BufferedWriter buw=new BufferedWriter(new OutputStreamWriter(ous));
        buw.write("Hello");
        buw.newLine();   // 用newLine写的必须用readLine接收，不然不行！
        buw.flush(); // 字符流的手动刷新,必须得刷新，不刷新不行


        System.out.println("111");

        InputStream ins=client.getInputStream();
        BufferedReader bui=new BufferedReader(new InputStreamReader(ins));
        String s=bui.readLine();
        System.out.println(s);
        System.out.println("111");

        bui.close();
        buw.close();
        client.close();
    }
}

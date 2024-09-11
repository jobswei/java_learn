package learn.socket.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class hmk11 {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        OutputStream out = socket.getOutputStream();
        BufferedWriter buw = new BufferedWriter(new OutputStreamWriter(out));
        buw.write("fuck");
        buw.newLine();
        buw.flush();

        InputStream inp=socket.getInputStream();
        BufferedReader bur = new BufferedReader(new InputStreamReader(inp));
        String instr=bur.readLine();
        System.out.println(instr);

        bur.close();
        buw.close();
        socket.close();

    }
}

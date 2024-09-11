package learn.socket.exercises;

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
import java.net.UnknownServiceException;

public class hnk12 {
    public static void main(String [] args) throws UnknownServiceException,IOException{
        ServerSocket server = new ServerSocket(8888);

        Socket socket=server.accept();

        InputStream inp= socket.getInputStream();
        BufferedReader bur=new BufferedReader(new InputStreamReader(inp));
        String instr=bur.readLine();

        String outstr="";
        switch(instr){
            case "name":
                outstr="nova";
                break;
            case "hobby":
                outstr="write java program";
                break;
            default:
                outstr="What are you saying ? ";
        }

        OutputStream out = socket.getOutputStream();
        BufferedWriter buw=new BufferedWriter(new OutputStreamWriter(out));
        buw.write(outstr);
        buw.newLine();
        buw.flush();

        buw.close();
        bur.close();
        socket.close();
        server.close();


    }
}

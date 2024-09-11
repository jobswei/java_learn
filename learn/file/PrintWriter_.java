package file;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class PrintWriter_ {
    public static void main(String[] args) throws IOException{
        PrintWriter printWriter=new PrintWriter(System.out);
        printWriter.write("efwefwef\n");
        printWriter.close();

        PrintWriter pw=new PrintWriter(new FileWriter("news7.txt"));
        pw.write("srgsrgsrgsrg");
        pw.close();
    }

}

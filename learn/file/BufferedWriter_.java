package learn.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException{
        String filePath="D://About_coding/java/learn/file/news5.txt";
        File file=new File(filePath);
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file,true));
        bufferedWriter.write("hello\n");
        bufferedWriter.write("hello2");
        bufferedWriter.newLine();
        bufferedWriter.write(filePath, 0, 10 );
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

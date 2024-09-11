package learn.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_  {
    public static void main(String[] args) throws IOException{
        String filePath="D://About_coding/java/learn/file/news3.txt";
        File file=new File( filePath);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        // 当返回空时，表示读取完毕
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();

    }
}

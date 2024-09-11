package learn.file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 默认情况下，读取文件是按照utf-8编码读取
public class CodeQuestion{
    public static void main(String[] args) throws IOException{
        String filePath="D://About_coding/java/learn/file/Chinese2.txt";
        File file=new File(filePath);
        BufferedReader bur= new BufferedReader(new FileReader(file));
        String s=bur.readLine();
        System.out.println(s);
        bur.close();
    }

}

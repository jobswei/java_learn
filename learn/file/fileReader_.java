package learn.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class fileReader_ {
    public static void main(String [] args) throws IOException{

    }

    @Test
    public void read01() throws IOException{
        File file=new File("D://About_coding/java/learn/file/news3.txt");
        FileReader fileReader=new FileReader(file);
        int data=0;
        while((data=fileReader.read())!=-1){
            System.out.print((char)data);
        }

        if(fileReader!=null) fileReader.close();
    }

    @Test 
    public void read02() throws IOException{
        File file=new File("D://About_coding/java/learn/file/news3.txt");
        FileReader fileReader=new FileReader(file);
        char[] buffer=new char[8];
        int len=0;
        while((len=fileReader.read(buffer))!=-1){
            System.out.print(new String(buffer,0,len));
        }

        if(fileReader!=null) fileReader.close();
    }
}

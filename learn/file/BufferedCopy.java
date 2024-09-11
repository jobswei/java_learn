package learn.file;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferedCopy {
    public static void main(String[] args) throws IOException{
        String parentPath="D://About_coding/java/learn/file";
        File file1=new File(parentPath,"news5.txt");
        File file2=new File(parentPath,"news5.2.txt");
        String line=" ";
        BufferedReader bur=new BufferedReader(new FileReader(file1));
        BufferedWriter buw=new BufferedWriter(new FileWriter(file2));
        while((line=bur.readLine())!=null){
            buw.write(line);
            buw.newLine();// 读入的时候不会读入换行符
            buw.flush();
        }
        bur.close();
        buw.close();
    }
}

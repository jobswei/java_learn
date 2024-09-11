package learn.file;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

// 字节流转成字符流的转换流
// 可以指定编码方式，从而解决乱码问题
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException{
        String filePath="D://About_coding/java/learn/file/Chinese.txt";
        File file=new File(filePath);
        FileInputStream fileInputStream=new FileInputStream(file);
        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"gbk");
        BufferedReader bur=new BufferedReader(inputStreamReader);
        String s=bur.readLine();
        System.out.println(s);
        bur.close();
    }
}

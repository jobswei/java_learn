package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
// 以指定的字符输出
// 可以指定编码
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        File file=new File("news.txt");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file),"gbk");
        BufferedWriter buw=new BufferedWriter(outputStreamWriter);
        buw.write("僧发算高");
        buw.close();
    }
}

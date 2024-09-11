package learn.file;
import java.io.File;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStream_ {
    public static void main(String[] args){

    }

    // 单个字节的读取，效率比较低
    @Test
    public void readFile01() throws FileNotFoundException,IOException{
        int readData=0;
        String filePath="D://About_coding/java/learn/file/news2.txt";
        File file=new File(filePath);
        FileInputStream fileInputStream= new FileInputStream(file);
        // 从该输入流读入一个字节的数据，如果没有输入可用，此方法将阻止
        // 如果返回-1，表示读取完毕
        while((readData = fileInputStream.read()) != -1){
            System.out.print((char)readData);
            // 中文乱码，因为一个中文字符不是一个字节，是三个字节
        }
        // 关闭文件流
        fileInputStream.close();
    }

        // 使用read(byte [] b)读取
        @Test
        public void readFile02() throws FileNotFoundException,IOException{
            int readLength=0;
            byte [] buffer=new byte[3]; // 一次读取3个字节
            String filePath="D://About_coding/java/learn/file/news2.txt";
            File file=new File(filePath);
            FileInputStream fileInputStream= new FileInputStream(file);
            // 从该输入流读入b.length字节的数据，如果没有输入可用，此方法将阻止
            // 如果返回-1，表示读取完毕
            // 如果读取正常，返回的是实际读取到的字节数
            // 用String将byte数组转化成字符串
            while((readLength=fileInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer,0,readLength));
            }
            // 关闭文件流
            fileInputStream.close();
        }
}

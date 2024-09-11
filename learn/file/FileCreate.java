package learn.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileCreate {
    @Test
    public void create01() throws IOException{
        String filePath="D://About_coding/java/learn/file/news1.txt";
        File file=new File(filePath);
        file.createNewFile();
        System.out.println("OK");
    }
    @Test
    // 方法2 父目录文件+子路径创建
    public void create02() throws IOException{
        String parent="D://About_coding/java/";
        String child="./learn/file/news2.txt";
        File parentFile=new File(parent);
        File file=new File(parentFile,child);
        file.createNewFile();
        System.out.println("OK");
    }
    @Test
    // 方法3 父目录+子路径
    public void create03() throws IOException{
        String parent = "D://About_coding/java/";
        String child="./learn/file/news3.txt";
        File file = new File(parent, child);
        file.createNewFile();
        System.out.println("OK");
    }
    
}

package learn.file;
import java.io.File;

import org.junit.Test;
public class FileInformation {
    
    // 获取文件信息
    @Test 
    public void info(){
        File file=new File("D://About_coding/java/learn/file");
        System.out.println("File name= "+file.getName());
        System.out.println("Absolute path= "+file.getAbsolutePath());
        System.out.println("Parent path= "+file.getParent());
        System.out.println("Size(bytes)= "+file.length());
        System.out.println("Exist = "+file.exists());
        System.out.println("isFile= "+file.isFile());
        System.out.println("isDirectory= "+file.isDirectory());


    }
    
}

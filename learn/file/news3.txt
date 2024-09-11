package learn.file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStream_ {
    
    @Test
    public void create01() throws IOException{
        String path="D://About_coding/java/learn/file";
        File parentFile=new File(path);

        File file=new File(parentFile,"news1.txt");
        if(file.exists()==false){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);// append=ture 表示已追加的方式写入
        fileOutputStream.write("Hello word 鄂塞赛格".getBytes());
        fileOutputStream.write("Hello word 鄂塞赛格".getBytes(),0,3);
        fileOutputStream.close();
    }
}

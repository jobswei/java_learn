package learn.file;

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class BufferedCopy02 {
    public static void main(String[] args) throws IOException{
        String parentPath="D://About_coding/java/learn/file";
        File file1=new File(parentPath,"news5.txt");
        File file2=new File(parentPath,"news5.3.txt");

        BufferedInputStream bui=new BufferedInputStream(new FileInputStream(file1));
        BufferedOutputStream buo =new BufferedOutputStream(new FileOutputStream(file2));
        int c=0;
        while((c=bui.read())!=-1){
            buo.write(c);
            buo.flush();
        }
        bui.close();
        buo.close();
    }
}

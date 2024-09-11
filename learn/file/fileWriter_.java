package learn.file;

import org.junit.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_ {
    
    @Test
    public void write01() throws IOException{
        File file=new File("D://About_coding/java/learn/file/news4.txt");
        FileWriter fileWriter=new FileWriter(file);

        fileWriter.write("wefehjfiowefiowef\n");
        // flus和close必须有一个，否则就写不进去
        fileWriter.flush();
        
        char[] chars={'e','e','s','\n'};
        fileWriter.write(chars);
        fileWriter.flush();

        fileWriter.write("魏子喻fuhseioufes".toCharArray(),0,3);
        fileWriter.flush();

        fileWriter.close();
    }
}

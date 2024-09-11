package learn.file.exercises;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
public class hmk2 {
    public static void main(String [] args) throws IOException{
        File fp=new File("./learn/file/exercises/ex1.java");
        BufferedReader bur=new BufferedReader(new FileReader(fp));
        String line;
        int cnt=1;
        while((line=bur.readLine())!=null){
            System.out.println(++cnt+" "+line);
        }
        bur.close();

    }
}

package learn.file.exercises;
import java.io.File;
import java.io.IOException;
public class hmk1 {
    public static void main(String[] args) throws IOException{
        File dir=new File("./learn/file/exercises/mytemp/");
        if((!dir.exists()) || dir.isFile()){
            dir.mkdir();
            System.out.println("Created Successfully");
        }else{
            System.out.println("Already exists");
        }

        File fp=new File(dir,"hello.txt");
        if(!fp.exists()){
            fp.createNewFile();
            System.out.println("Created Successfully!");

        }else{
            System.out.println("Already exists!");
        }
    }
}

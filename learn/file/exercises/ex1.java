package learn.file.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
    public static void main(String [] args) throws IOException {
        File fp = new File("./learn/file/exercises/ex.txt");
        System.out.println(fp.getAbsolutePath());
        try{
            fp.createNewFile();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        BufferedWriter buw = new BufferedWriter(new FileWriter(fp,false));
        buw.write("Hello! I am back");
        buw.flush();
        buw.close();

    }

}

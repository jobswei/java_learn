package practice1;
import java.io.File;
public class CreatDir {
	public static void main(String[] args) {
		String dirname="C://Users/lenovo/Desktop/java";
		File d=new File(dirname);
		
		d.mkdirs();
	}
}

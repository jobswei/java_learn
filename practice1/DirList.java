package practice1;
import java.io.File;
public class DirList {
	public static void main(String[] args) {
		String dirname="C://Users/lenovo/Desktop";
		File fi=new File(dirname);
		if(fi.isDirectory()) {
			System.out.println("Ŀ¼"+dirname);
			String s[]=fi.list();
			for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " ��һ��Ŀ¼");
                } else {
                    System.out.println(s[i] + " ��һ���ļ�");
                }
            }
        } else {
            System.out.println(dirname + " ����һ��Ŀ¼");
        }
		}
}

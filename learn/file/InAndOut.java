package learn.file;

import java.util.Scanner;

public class InAndOut {
    public static void main(String [] args){
        // System 类 的public final static InputStream in=null;
        // System.in 编译类型 InputStream
        // System.in 运行类型 BufferedInputStream
        // 标准输入：键盘
        System.out.println(System.in.getClass());
        // Scanner 从标准输入流获取内容
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(s);
        scanner.close();
        
        // System.out  public final static PrintStream out=null;
        // 编译类型 PrintStream
        // 运行类型 PrintStream
        // 标准输出：显示器
        System.out.println(System.out.getClass());
    }
}

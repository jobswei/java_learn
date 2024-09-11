package file;

import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;
// 打印流只有输出流，没有输入流
public class PrintStream_ {
    public static void main(String[] args) throws IOException{
        PrintStream out=System.out;
        // 在默认情况下，PrintStream输出数据的位置是标准输出，即显示器
        out.println("hello");
        out.write("嗯".getBytes());
        out.close();
        System.setOut(new PrintStream("news7.txt"));
        System.out.println("1234");
    }
}

package learn;
import java.io.*;

public class BRRead{
    public static void main(String[] args) throws IOException{
        char c;
        // 使用System.in创建 BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input char, q for quit.");
        do{
            c=(char) br.read();// 默认read出来是int的形式
            System.out.println(c);
        }while(c!='q');

        // 从控制台读取字符串
        String str;
        System.out.println("Enter strings,end for quit");
        do{
            str=br.readLine();
            System.out.println(str);
        }while(!str.equals("end"));

        // 写入文件
        try{
            OutputStream fOut=new FileOutputStream("fiel.txt");
            /*File f=new File("file.txt");
            OutputStream fOut=new FileOutputStream(f);*/
            //因为默认输出都是二进制的，所以可以用OSWriter转义
            OutputStreamWriter writer=new OutputStreamWriter(fOut,"UTF-8");
            writer.append("English\n");
            fOut.close();
        }  catch(IOException e){
            System.out.println("Exception");
        }
        // 读入文件
        InputStream fIn=new FileInputStream("file.txt");
        int size=fIn.available();
        for(int i=0;i<size;i++){
            System.out.print((char)fIn.read()+" ");
        }
        fIn.close();

    }

}
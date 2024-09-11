package learn.file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException{
        String filePath="D://About_coding/java/learn/file/news6";
        File file=new File(filePath);
        ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream(file));
        output.writeInt(100);//int -> Integral (实现了serialable接口)
        output.writeBoolean(true);
        output.writeChar('a');
        output.writeDouble(3.33);
        output.writeUTF("ewfwefwefwefw");
        // 保存一个dog对象
        output.writeObject(new Dog("daf"));
        output.flush();
        output.close();
        System.out.println("序列化保存完毕");
    }
}

class Dog implements Serializable{
    private String dog=" ";
    // 序列化的版本号，提高兼容性
    // 如果序列化和反序列化的类有一些不同，他只会认为是升级版，而不会认为是不同的类
    private static final long serialVersionUID=1L;
    public Dog(String dog){
        this.dog=dog;
    }
    public void name(){
        System.out.println(this.dog);
    }
}
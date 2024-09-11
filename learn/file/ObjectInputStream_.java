package learn.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;
public class ObjectInputStream_ {
    public static void main(String [] args) throws ClassNotFoundException, IOException{
        String filePath="D://About_coding/java/learn/file/news6";
        File file=new File(filePath);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        // 反序列化的顺序一定和序列化的顺序一致
        int num=ois.readInt();
        System.out.println(num);
        boolean b=ois.readBoolean();
        System.out.println(b);
        char c=ois.readChar();

        double d=ois.readDouble();

        String s=ois.readUTF();

        Object dog=ois.readObject();
        System.out.println(dog.getClass());
        // 调用方法之前必须要转型
        Dog dog2=(Dog)dog;
        dog2.name();        
        ois.close();
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

package learn.file;

import java.io.File;

import org.junit.Test;

public class Directory_ {
    
    @Test
    // 判断并删除
    // java中，目录也被当成文件，也是这样删除的
    public void m1(){
        String filePath="D://About_coding/java/learn/file/news1.txt";
        File file=new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("successfully delete");
            }else{
                System.out.println("fail to delete");
            }
        }else{
            System.out.println("not exist");
        }

    }
    @Test
    // java中，目录也被当成文件，也是这样删除的
    public void m2(){
        String filePath="D://About_coding/java/learn/file/a";
        File file=new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("successfully delete");
            }else{
                System.out.println("fail to delete");
            }
        }else{
            System.out.println("not exist");
        }

    }
    @Test
    // mkdirs: 多级目录 mkdir: 一级目录
    public void m3(){
        String filePath="D://About_coding/java/learn/file/a/b/c";
        File file=new File(filePath);
        if(file.exists()){
            System.out.println(filePath+"exists");
        }else{
            if(file.mkdirs()) System.out.println("success");else System.out.println("fail");
        }
    }
}

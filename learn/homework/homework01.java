package learn.homework;
import java.util.Scanner;
public class homework01 {
    public static void main(String [] args){
        T1 t1=new T1();
        T2 t2=new T2();
        t1.start();
        t2.start();
    }
}

class T1 extends Thread{
    public static boolean loop=true;
    @Override
    public void run(){
        while(loop){
            System.out.println("hello");
            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
        }
    }

    // public void setLoop(boolean loop){
    //     T1.loop=loop;
    // }
}
    
class T2 extends Thread{
    Scanner scanner=new Scanner(System.in);
    String s;
    @Override
    public void run(){
        do{
            s=scanner.next();
        }while(! (s.equals("q")));
        T1.loop=false;
    }

}
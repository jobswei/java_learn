package learn.threadUse;

public class Thread03 {
    public static void main(String[] args){
        T1 t1=new T1();
        T2 t2=new T2();
        Thread thread1=new Thread(t1);
        thread1.start();
        Thread thread2=new Thread(t2);
        thread2.start();
        Thread thread22=new Thread(t2);// 实现Runnable的方法可以多个线程共享一个资源，更加推荐
        thread22.start();

    }
}

class T1 implements Runnable{
    int count=0;
    @Override
    public void run(){
        while(true){
            System.out.println("hello word"+(++count));
            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
            if(count==50){break;}
        }
    }
}

class T2 implements Runnable{
    int count=0;
    @Override
    public void run(){
        while(true){
            System.out.println("hi"+(++count));
            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
            if(count==100){break;}
        }
    }
}

package learn.threadUse;

public class ThreadExit_ {
    public static void main(String[] args){
        T t1=new T();
        t1.setName("wzy");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        try{Thread.sleep(5000);}
        catch(InterruptedException e){e.printStackTrace();} 
        t1.setLoop(false);

        //主线程输出5个hi，就中断子线程的休眠
        for(int i=0;i<5;i++){
            try{Thread.sleep(50);}
            catch(InterruptedException e){e.printStackTrace();} 
            System.out.println("hi");
        }

        t1.interrupt();

    }
}

class T extends Thread{
    // 设置一个控制变量
    private boolean loop=true;
    @Override
    public void run(){
        while(loop){

            try{Thread.sleep(500);}
            catch(InterruptedException e){e.printStackTrace();}

            System.out.println("hello");

        }
        try{Thread.sleep(50000);}
        catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName()+" is interrupted");
        }
        System.out.println("finish");

    }
    public void setLoop(boolean loop){
        this.loop=loop;
    }
}
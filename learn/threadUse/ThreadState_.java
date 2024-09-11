package learn.threadUse;

public class ThreadState_ {
    public static void main(String [] args) throws InterruptedException{
        TState t=new TState();
        t.start();
        while(Thread.State.TERMINATED!=t.getState()){
            System.out.println("State of "+t.getName()+t.getState());
            Thread.sleep(300);
        }
        System.out.println("State of "+t.getName()+t.getState());

    }
}

class TState extends Thread{
    @Override
    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("hello"+i);
            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
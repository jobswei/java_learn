package learn.threadUse;
// 通过实现接口Runnable开发线程
public class Thread02 {
    public static void main(String [] args){
        // Dog dog=new Dog();
        // Thread thread=new Thread(dog);
        // thread.start();

    }
}
class ThreadProxy implements Runnable{
    private Runnable target=null;

    @Override
    public void run() {
        if(target != null){
            target.run();
        }
    }
    public ThreadProxy(Runnable target){
        this.target=target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
    }

}
class Dog implements Runnable{
    int count=0;
    @Override
    public void run() {
        while(true){
            System.out.println("Wang!"+(++count)+Thread.currentThread().getName());
            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
            if(count==10){break;}
        }
    }
}

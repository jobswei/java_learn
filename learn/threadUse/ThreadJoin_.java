package learn.threadUse;
// 线程插队
public class ThreadJoin_ {
    public static void main(String[] args) throws InterruptedException{
        TJoin t1=new TJoin();
        t1.start();

        //主线程输出5个hi，就中断子线程的休眠
        for(int i=0;i<30;i++){
            if(i==10){
                System.out.println("Let t1 go!");
                t1.join();
            }
            Thread.sleep(500);
            System.out.println("hi");
        }

    }
}

class TJoin extends Thread{
    // 设置一个控制变量
    int count=0;
    @Override
    public void run(){
        while(true){

            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
            System.out.println("hello"+(++count));

            if(count==10){break;}
        }

    }
}
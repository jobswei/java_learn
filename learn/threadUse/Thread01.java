package learn.threadUse;
// 通过继承Thread类创建线程
public class Thread01{
    public static void main(String[] args) throws InterruptedException{
        Cat cat=new Cat();
        cat.start(); // 启动线程
        // 说明  当main线程启动一个子线程后，主线程不会阻塞
        for(int i=0;i<80;i++){
            System.out.println("main thread "+Thread.currentThread().getName()+i);
            Thread.sleep(1000);
        }
        

    }
}

// 1. 当一个类继承了Thread类，该类就可以当做线程使用
// 2. 我们会重写run方法，写上自己的业务代码
// 3. run Thread 类实现了Runnable接口的run方法
// @Override
// public void run() {
//     if (target != null) {
//         target.run();
//     }
// }
class Cat extends Thread{
    int times=0;
    @Override
    public void run(){//重写run方法，写入自己的业务逻辑
        while(true){
            System.out.println("I am a cat."+(++times)+"thread name: "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            if(times==80){// 80次后，while退出，线程也结束了
                break;
            }
        }

    }
}
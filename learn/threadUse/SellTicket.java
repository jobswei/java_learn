package learn.threadUse;
// 使用多线程，模拟三个窗口同时售票
public class SellTicket {
    public static void main(String[] args){

        // // 出现超卖现象
        // SellTicket01 sellTicket01=new SellTicket01();
        // SellTicket01 sellTicket02=new SellTicket01();
        // SellTicket01 sellTicket03=new SellTicket01();

        // sellTicket01.start();
        // sellTicket02.start();
        // sellTicket03.start();
        // //用接口的方式也会出现超卖

        // // 使用synchronize解决
        // Thread sellTicket01=new Thread(new SellTicket03());
        // Thread sellTicket02=new Thread(new SellTicket03());
        // Thread sellTicket03=new Thread(new SellTicket03());

        // sellTicket01.start();
        // sellTicket02.start();
        // sellTicket03.start();
        // 这样还是不行, 因为你弄了3个类，这样的话要将m()方法设为static
        SellTicket03 sellTicket03=new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

// class SellTicket01 extends Thread{
//     private static int ticketNum=100; // 让多个线程共享ticketNum
//     @Override
//     public void run(){
//         while(true){

//             if(ticketNum<=0){
//                 System.out.println("No ticket!");
//                 break;
//             }

//             try{Thread.sleep(500);}
//             catch(InterruptedException e){e.printStackTrace();}

//             System.out.println("Window "+Thread.currentThread().getName()+" sells 1 ticket, "+(--ticketNum)+" left.");

//         }

//     }
// }

// class SellTicket02 implements Runnable {
//     private static int ticketNum=100; // 让多个线程共享ticketNum
//     @Override
//     public void run(){
//         while(true){

//             if(ticketNum<=0){
//                 System.out.println("No ticket!");
//                 break;
//             }

//             try{Thread.sleep(500);}
//             catch(InterruptedException e){e.printStackTrace();}

//             System.out.println("Window "+Thread.currentThread().getName()+" sells 1 ticket, "+(--ticketNum)+" left.");

//         }

//     }
// }

class SellTicket03 implements Runnable{
    private static int ticketNum=100; // 让多个线程共享ticketNum

    Object object=new Object();
    // 1. public sychronized void sell(); 就是一个同步方法
    // 2. 这时实在this加锁
    // 3. 也可以在代码块上加锁
    public synchronized void m(){// 同步方法，在同一个时刻只能由一个线程来执行run方法
        
        if(ticketNum<=0){
            System.out.println("No ticket!");
            return;
        }
        System.out.println("Window "+Thread.currentThread().getName()+" sells 1 ticket, "+(--ticketNum)+" left.");

    }
    public void m2(){
        synchronized(/*this*/object){ // 只要加在同一个对象上就可以
            if(ticketNum<=0){
                System.out.println("No ticket!");
                return;
            }
            System.out.println("Window "+Thread.currentThread().getName()+" sells 1 ticket, "+(--ticketNum)+" left.");
        }

    }
    public static void m3(){
        synchronized(SellTicket03.class){//静态方法的锁要加在类本身上
            if(ticketNum<=0){
                System.out.println("No ticket!");
                return;
            }
            System.out.println("Window "+Thread.currentThread().getName()+" sells 1 ticket, "+(--ticketNum)+" left.");
        }

    }
    @Override
    public void run(){
        while(ticketNum>0){
            m();
            try{Thread.sleep(100);}
            catch(InterruptedException e){e.printStackTrace();}
        }

    }
}


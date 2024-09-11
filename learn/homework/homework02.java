package learn.homework;

import java.util.Scanner;

public class homework02 {
    public static void main(String[] args){
        User user=new User();
        new Thread(user).start();
        new Thread(user).start();
        
    }
    
}


class User implements Runnable{
    private static int money=1000;

    Scanner scanner=new Scanner(System.in);

    public synchronized void getMoney(){
        if(money<=0){
            return;
        }
        int get;
        get=scanner.nextInt();
        if(get>money){
            System.out.println("No enough money! Money: "+money);
            return;
        }
        money-=get;
        System.out.println("User "+Thread.currentThread().getName()+" get "+get+", "+money+" left. ");
    }

    @Override
    public void run(){
        while(money>=0){
            getMoney();
        }
        System.out.println("No money left.");
    }
}


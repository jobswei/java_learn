package learn;

import java.util.Arrays;
import java.util.Date;
import java.text.*;

public class Learn {
	protected void math(){
		System.out.println("sin of 90: "+Math.sin(Math.PI/2));
		
	}
	protected void array(){
		int[] mylist=new int[10];
		Arrays.fill(mylist,0);//初始化
		int[] mylist2={1,2,3,4,5};
		System.out.println(mylist.length);
		for (int i:mylist2){
			System.out.print(i);
		}
	}
	public static int[] reverse(int[] list){
		int[] result=new int[list.length];

		for(int i=list.length-1,j=0;i>=0;i--,j++){
			result[j]=list[i];
		}
		return result;
	}
	protected void DateTime(){
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("Now time is: "+ft.format(date));
	}
    protected void doWhile(){
        int x=10;
		
		do {
			System.out.print("value of x:"+x);
			x++;
			System.out.print("\n");
		} while(x<20);
    }

	// 可变参数
	public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
 
        double result = numbers[0];
 
        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
	public static void main(String[] args){
		Learn mylearn =new Learn();
		mylearn.math();

		// 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
		
	}
}

// 一个类可以有多个构造方法，但构造方法必须与类同名
class Puppy{
    public Puppy(){
    }
 
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
    }
}

class Animal{
	private String name;
	private int id;
	Animal(String myName, int myid){
		name=myName;
		id=myid;
	}
	public void eat(){
		System.out.println(name+" is eating");
	}
}
class Penguin extends Animal{
	Penguin(String myName, int myid){
		super(myName,myid);
	}
}
// 类只能继承一个父类，但是可以继承多个接口
public interface A {
    public void eat();
    public void sleep();
}
 
public interface B {
    public void show();
}

public class C implements A,B {
}





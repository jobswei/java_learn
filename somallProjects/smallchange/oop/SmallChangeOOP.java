package somallProjects.smallchange.oop;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
/** 
 * 该类是完成零钱通各个功能的类
 * 使用OOP（面向对象的编程）
 */
public class SmallChangeOOP{
    // 属性
    boolean loop=true;
    Scanner scanner = new Scanner(System.in);
    String key;

    // 2、完成零钱通明细
    String details="------- Details --------";

    // 3、完成收益入账
    // 老韩思路，定义新的变量
    double money=0;
    double balance=0; // 余额
    Date date=null;

    // 4、消费
    String where;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");// 用于日期格式化
    public void mainMenu(){
        do{
            System.out.println("==== Menu ====");
            System.out.println(" 1.All");
            System.out.println(" 2.Income");
            System.out.println(" 3.Pay");
            System.out.println(" 4.quit");

            System.out.print("Please choose(1-4): ");
            key=scanner.next();

            // 使用switch分支
            switch (key){
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4" :
                    this.quit();
                    break;
                default:
                    System.out.println("Error in your input,pleasr input again");
            }
        }while(loop);
    }
    
    public void details(){
        System.out.println(details);
    }

    public void income(){
        System.out.println("Income: ");
        money=scanner.nextDouble();
        // money的值应该校验
                    // 老韩思路：找出不正确的条件，然后退出
        if(money<=0){
            System.out.println("Correct income: >0");
            return;
        }

        balance+=money;
        // 添加收益入账到details
        date=new Date();//获取当前日期

        details+="\nIncome:\t+"+money+"\t"+sdf.format(date)+"\t"+balance;
    }

    public void pay(){
        System.out.println("Where: ");
        where=scanner.next();
        System.out.println("How much: ");
        money=scanner.nextDouble();
        // 应该有校验
        balance-=money;
                    
        date=new Date();
        details+="\n"+where+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
    }

    public void quit(){
        String k;
        // 先判断是不是y或n，在判断是y还是n
        // 建议一段代码完成一个小功能，不要混在一起
        do{
            System.out.println("Sure to quit ?(y/n)");
            k=scanner.next();
        }while(!(k.equals("y")||k.equals("n")));

        if(k.equals("y")){
            loop=false;
        }
    }
}
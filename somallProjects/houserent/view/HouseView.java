package somallProjects.houserent.view;

import somallProjects.houserent.domain.House;
import somallProjects.houserent.service.HouseService;
import somallProjects.houserent.service.Utility;
//**界面层 */
public class HouseView {
    private boolean loop=true;
    private char key=' ';
    private HouseService houseservice=new HouseService(10);

    public void listHouses(){
        System.out.println("--------------------- House List------------------");
        System.out.println("Number\tOwner\tPhone\tAddress\tMoney\tState");
        House [] houses=houseservice.list();
        for(House i:houses){
            if(i==null){
                break;
            }
            System.out.println(i);// 直接输出回默认调用toString方法
        }

    }
    public void addHouse(){
        System.out.print("==================== Add Houses ================");
        System.out.print("\nname:");
        String name=Utility.readString(10,"unkonwn");
        System.out.print("\nphone:");
        String phone=Utility.readString(12);
        System.out.print("\naddress:");
        String address=Utility.readString(16);
        System.out.print("\nmoney:");
        int money=Utility.readInt();
        System.out.print("\nstate:");
        String state=Utility.readString(5);
        // id 是系统分配的
        House house=new House(0,name,phone,address,money,state);
        if(houseservice.add(house)){
            System.out.println("Successfully");
        }else{
            System.out.println("Fail");
        }

    }
    public void delHouse(){
        System.out.println("================== Delete House ===================");
        System.out.println("Enter the id you want to delete(-1 for quit): ");
        int id=Utility.readInt();
        if(id==-1){
            System.out.println("You have given up deltee");
            return;
        }
        char k=Utility.readConfirmSelection();
        if(k=='Y'){
            if(houseservice.delete(id)){
                System.out.println("Successfully");
            }else{
                System.out.println("Fail");
            }
        }else{
            System.out.println("You have given up deltee");
        }
        return;

    }
    public void quit(){
        System.out.print("Sure to quit? ");
        char k=Utility.readConfirmSelection();
        if(k=='Y'){
            this.loop=false;
        }
    }
    public void mainMenu(){
        do{
            System.out.println("================== House Rent ==================");
            System.out.println("\t1. New House");
            System.out.println("\t2. Find House");
            System.out.println("\t3. Delete House");
            System.out.println("\t4. Change House");
            System.out.println("\t5. Display House");
            System.out.println("\t6. Quit");
            System.out.println("Input your choice(1-6)");
            key=Utility.readChar();
            switch(key){
                case '1':
                    this.addHouse();
                    break;
                case '2':
                    System.out.println("New");
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    System.out.println("New");
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    this.quit();
                    break;
                default:
                    System.out.println("Error");
            }
        }while(loop);

    }
    
}

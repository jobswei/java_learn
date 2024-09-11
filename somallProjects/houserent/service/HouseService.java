package somallProjects.houserent.service;
import somallProjects.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums=1;
    private int idCounter=1;

    public HouseService(int size){// 构建方法没有返回声明
        houses=new House[size];
        houses[0]=new House(1,"test","test","test",100,"test");
    }

    public House[] list(){
        return houses;
    }

    public boolean add(House newHouse){
        // 暂时不考虑扩容的问题
        if(houseNums>=houses.length){
            System.out.println("full!");
            return false;
        }
        houses[houseNums++]=newHouse;// 后++
        // 更新id
        newHouse.setId(++idCounter);
        return true;

        
    }

    public boolean delete(int id){

        int index=-1;
        for(int i=0;i<houseNums;i++){
            if(id==houses[i].getId()){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("No such id");
            return false;
        }
        if(index<houseNums-1){
            for(int i=index;i<houseNums-1;i++){
                houses[i]=houses[i+1];
            }
        }
        houses[--houseNums]=null;
        
        return true;
    }
}

package learn;
import tools.Matrix;

public class MiGong {
    public static void main(String[] args){
        // 0表示可以走，1表示障碍物
        int [][] map=new int[8][7];
        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
            if(i<7){
                map[0][i]=1;
                map[7][i]=1;
            }
        }
        map[3][1]=1;map[3][2]=1;map[4][3]=1;
        
        System.out.println("====Present Map======");
        Matrix.displayMatrix(map);
        
        // 使用findWay给老鼠找路
        T t1=new T();
        t1.findWay(map,1,1);
        System.out.println("\n==== result ====");
        Matrix.displayMatrix(map);
        
        
        return;
    }
}

class T {
    // 使用递归回溯的思想
    // 1.i,j就是老鼠的位置，初始化的位置为(1,1)
    // 2. 因为是递归线路，所以先规定map各个值的含义
    // 3. 0表示可以走，1表示障碍物，2表示可以走通，3表示走过，但是走不通是死路
    // 4. 当map[6][5]=2 就说明找到通路，就可以结束，否则继续找
    // 5. 先确定老鼠找路的策略 下->右->上->左
    public boolean findWay(int [][] map,int i,int j){

        if(map[6][5]==2){
            return true;
        }else{
            if (map[i][j]==0){// 当前位置为0，说明可以走
                map[i][j]=2;// 假定可以走通
                // 使用策略判断是否真的可以走通
                if (findWay(map,i+1,j)){
                    return true;
                }else if(findWay(map,i,j+1)){
                    return true;
                }else if(findWay(map,i-1,j)){
                    return true;
                }else if(findWay(map,i, j-1)){
                    return true;
                }else{
                    map[i][j]=3;
                    return false;
                }
            }else{//map[i][j]=1,3
                return false;
            }
        }
        
    }
}
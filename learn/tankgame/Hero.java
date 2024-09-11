package learn.tankgame;

// 自己的tank
public class Hero extends Tank{
    private int direct=0;
    public Hero(int x,int y){
        super(x,y);
    }
    public int getDirect(){
        return this.direct;
    }
    public void setDirect(int direct){
        this.direct=direct;
    }
    
}

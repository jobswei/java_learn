package learn.tankgame;

public class EnemyTank extends Tank {
    private int direct=0;
    public EnemyTank(int x,int y){
        super(x,y);
    }
    public int getDirect(){
        return this.direct;
    }
    public void setDirect(int direct){
        this.direct=direct;
    }
}

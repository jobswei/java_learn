package learn.tankgame;

public class Tank {
    private int x;//tank的横坐标
    private int y;
    private int v=1;
    public Tank(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void moveUp(){
        y-=v;
    }
    public void moveLeft(){
        x+=v;
    }
    public void moveDown(){
        y+=v;
    }
    public void moveRight(){
        x-=v;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getSpeed(){
        return v;
    }
    public void setSpeed(int v){
        this.v=v;
    }

}

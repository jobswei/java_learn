package learn.tankgame;

import javax.swing.JFrame;

public class WzyTankGame01 extends JFrame {
    MyPanel mp=null;
    public static void main(String[] args){
        WzyTankGame01 wzyTankGame01=new WzyTankGame01();

    }

    public WzyTankGame01(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

package learn.draw;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * 演示如何在面板上画出圆形
 */
public class DrawCircle extends JFrame{
    // 定义一个面板
    private MyPanel mp=null;
    public static void main(String[] args){
        new DrawCircle();
        return;
    }
    public DrawCircle(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);// 可以显示
    }
}
// 1. 先定义一个MyPanel,继承JPanel类，
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g); // 调用父类的方法，完成初始化
        // System.out.println("print diaoyong");
        // 画一个圆
        g.drawOval(10,10,100,100);

    }
}
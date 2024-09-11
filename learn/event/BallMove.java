package learn.event;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//演示小球通过键盘控制上下左右--》讲解java的事件

//KeyListener 是一个监听器
public class BallMove extends JFrame{
    MyPanel mp=null;
    public static void main(String[] args){
        BallMove bm=new BallMove();
    }
    
    public BallMove(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(500,500);
        // 窗口JFrame 对象可以监听键盘事件，即可以监听面板上发生的键盘事件
        this.addKeyListener(mp);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener{
    // 为了让小球可以移动，把坐标设置为变量
    int x=10;
    int y=10;
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x,y,10,10);
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e){
        //System.out.println((char)e.getKeyCode()+" is pressed..");
        // 根据用户按下的不同键，处理小球的运动
        switch(e.getKeyCode()){
            case KeyEvent.VK_DOWN:
                y++;
                break;
            case KeyEvent.VK_UP:
                y--;
                break;
            case KeyEvent.VK_LEFT:
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                break;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){
        //System.out.println((char)e.getKeyCode()+" is released");

    }
}
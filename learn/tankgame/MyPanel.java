package learn.tankgame;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.util.Vector;
import java.awt.event.KeyEvent;
//tank大战的绘图区域
public class MyPanel extends JPanel implements KeyListener{
    Hero hero=null;
    Vector<EnemyTank> enemyTanks=new Vector<>();
    int enemyNum=3;

    public MyPanel(){
        hero=new Hero(500,600);
        hero.setSpeed(4);

        for(int i=0;i<enemyNum;i++){
            EnemyTank e=new EnemyTank(i*100+100, 10);
            e.setDirect(2);
            enemyTanks.add(e);
  
        }
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，，默认黑色
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        for(int i=0;i<enemyNum;i++){
            EnemyTank enemyTank=enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }
    }

    @Override
    public void keyTyped(KeyEvent e){
    }
    @Override 
    public void keyPressed(KeyEvent e){
        // System.out.println((char)e.getKeyCode()+" is pressed ...");
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:  
                hero.moveUp();
                hero.setDirect(0);
                repaint(); 
                break;
            case KeyEvent.VK_D:
                hero.moveLeft();
                hero.setDirect(1);
                repaint();
                break;
            case KeyEvent.VK_S:
                hero.moveDown();
                hero.setDirect(2);
                repaint();
                break;
            case KeyEvent.VK_A:
                hero.moveRight();
                hero.setDirect(3);
                repaint();
                break;

        }
    }
    @Override
    public void keyReleased(KeyEvent e){
    }

    public void drawTank(int x ,int y, Graphics g, int direct, int type){
        switch(type){
            case 0:// 自己的tank
                g.setColor(Color.cyan);
                break;
            case 1://敌人的tank
                g.setColor(Color.yellow); 
        }
        switch(direct){
            case 0://向上
                g.fill3DRect(x,y, 10, 60, true);
                g.fill3DRect(x+30,y, 10, 60, true);
                g.fill3DRect(x+10,y+10, 20, 40, true);
                g.setColor(Color.pink);
                g.fillOval(x+10, y+20,20 , 20);
                g.setXORMode(Color.GREEN);
                g.fill3DRect(x+18, y-8, 4, 38, true);
                break;
            case 1://向右
                g.fill3DRect(x-10,y+10, 60, 10, true);
                g.fill3DRect(x-10,y+40, 60, 10, true);
                g.fill3DRect(x,y+20, 40, 20, true);
                g.setColor(Color.pink);
                g.fillOval(x+10, y+20,20 , 20);
                g.setXORMode(Color.GREEN);
                g.fill3DRect(x+20, y+28, 38, 4, true);
                break;
            case 2://向下
                g.fill3DRect(x,y, 10, 60, true);
                g.fill3DRect(x+30,y, 10, 60, true);
                g.fill3DRect(x+10,y+10, 20, 40, true);
                g.setColor(Color.pink);
                g.fillOval(x+10, y+20,20 , 20);
                g.setXORMode(Color.GREEN);
                g.fill3DRect(x+18, y+30, 4, 38, true);
                break;
            case 3://向左
                g.fill3DRect(x-10,y+10, 60, 10, true);
                g.fill3DRect(x-10,y+40, 60, 10, true);
                g.fill3DRect(x,y+20, 40, 20, true);
                g.setColor(Color.pink);
                g.fillOval(x+10, y+20,20 , 20);
                g.setXORMode(Color.GREEN);
                g.fill3DRect(x-18, y+28, 38, 4, true);
                break;
        }

    }

}

package practice1.继承;

import com.runoob.practice.��̬.Animal;

public class Penguin extends Animal {
	private String name; 
    private int id; 
    public Penguin(String myName, int  myid) { 
    	super(myName, myid);
        name = myName; 
        id = myid; 
    } 
    public void eat(){ 
        System.out.println(name+"���ڳ�"); 
    }
    public void sleep(){
        System.out.println(name+"����˯");
    }
    public void introduction() { 
        System.out.println("��Һã�����"         + id + "��" + name + "."); 
    } 
    void eatTest() {
        this.eat();   // this �����Լ��ķ���
        super.eat();  // super ���ø��෽��
      }
}

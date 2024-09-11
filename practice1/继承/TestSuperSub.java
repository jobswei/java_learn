package practice1.继承;
package com.runoob.practice.�̳�;
class SuperClass {
	  int n=3;
	  SuperClass(){
	    System.out.println("SuperClass()");
	  }
	  SuperClass(int n) {
	    System.out.println("SuperClass(int n)");
	    this.n = n;
	  }
	}
	// SubClass ��̳�
	class SubClass extends SuperClass{
	  private int n;
	  
	  SubClass(){ // �Զ����ø�����޲���������
	    System.out.println("SubClass");
	  }  
	  
	  public SubClass(int n){ 
	    super(300);  // ���ø����д��в����Ĺ�����
	    System.out.println("SubClass(int n):"+n);
	    this.n = n;
	  }
	}
	// SubClass2 ��̳�
	class SubClass2 extends SuperClass{
	  private int n;
	  
	  SubClass2(){
	    super(300);  // ���ø����д��в����Ĺ�����
	    System.out.println("SubClass2");
	  }  
	  
	  public SubClass2(int n){ // �Զ����ø�����޲���������
		this.n = n;
	    System.out.println("SubClass2(int n):"+this.n);
	    
	  }
	}
public class TestSuperSub {
	  public static void main (String args[]){
		    System.out.println("------SubClass ��̳�------");
		    SubClass sc1 = new SubClass();
		    SubClass sc2 = new SubClass(100); 
		    System.out.println("------SubClass2 ��̳�------");
		    SubClass2 sc3 = new SubClass2();
		    SubClass2 sc4 = new SubClass2(200); 
		  }
}

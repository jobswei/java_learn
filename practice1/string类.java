package practice1;

public class string�� {
	public static void main(String args[]) {
		String s1 = "Runoob";              // String ֱ�Ӵ���
		String s2 = "Runoob";              // String ֱ�Ӵ���
		String s3 = s1;                    // ��ͬ����
		String s4 = new String("Runoob");   // String ���󴴽�
		String s5 = new String("Runoob");   // String ���󴴽�
		
		char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
	    String helloString = new String(helloArray);  
	    System.out.println("default");
	    System.out.println( helloString );
	    /* string ���ǲ��ɸı�ģ�������һ�������� String ����������ֵ���޷��ı��ˣ��꿴�ʼǲ��ֽ�������
	
	�����Ҫ���ַ������ܶ��޸ģ���ôӦ��ѡ��ʹ�� StringBuffer & StringBuilder �ࡣ*/
	     
	    String site = "www.runoob.com";
	    int len = site.length();
	    System.out.println( "����̳���ַ���� : " + len );
	    
	    "�ҵ������� ".concat("Runoob");	    
   
	    String string1 = "����̳���ַ��";     
	    System.out.println("1��" + string1 + "www.runoob.com");  
}
}

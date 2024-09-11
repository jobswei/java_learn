package practice1;
import java.util.Scanner; 

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // next��ʽ�����ַ���
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("���������Ϊ��" + str1);
        }
        scan.close();
    }
}
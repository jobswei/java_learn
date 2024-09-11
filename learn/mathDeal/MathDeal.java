package learn.mathDeal;

public class MathDeal {
    public static void main(String[] args){
        int[] a={1,2,3,4};
        Math.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}

class Math{
    public static void sort(int [] lis){
        lis[1]=lis[0];
    }
}

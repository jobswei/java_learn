package tools;

public class Matrix {
    public static void displayMatrix(int [][] m){
        for (int i=0; i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

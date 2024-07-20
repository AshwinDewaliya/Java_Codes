package TwoDArrayExamples;
import java.util.Scanner;

public class Ex1 {
    public static void setValues(int [][]matrix){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static void getValues(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        setValues(matrix);
        getValues(matrix);
        
    }
}

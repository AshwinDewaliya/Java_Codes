package TwoDArrayExamples;

import java.util.Scanner;

public class FindSmallest {
    public static void setValues(int [][]matrix){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static int findSmallest(int [][] matrix){
        int maxValue=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(maxValue>matrix[i][j]){
                    maxValue = matrix[i][j];
                    
                }
            }
        }
         
        return maxValue;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        setValues(matrix);
        System.out.println(findSmallest(matrix));
    }
}

package TwoDArrayExamples;

import java.util.Scanner;

public class FindLargest {

    public static void setValues(int [][]matrix){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static int findLargest(int [][] matrix){
        int minValue=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(minValue<matrix[i][j]){
                    minValue = matrix[i][j];
                    break;
                }
            }
        }
         
        return minValue;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        setValues(matrix);
        System.out.println(findLargest(matrix));
    }
}

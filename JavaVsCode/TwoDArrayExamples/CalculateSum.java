package TwoDArrayExamples;

public class CalculateSum {

    public static int matrixRowAddition(int [][] matrix){
        int sum=0;
        
        for(int i=0;i<matrix[0].length;i++){
            sum += matrix[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={
                        {1,2,4},
                        {5,2,4},
                        {8,2,7}
                    };
        System.out.println(matrixRowAddition(matrix));
    }
}

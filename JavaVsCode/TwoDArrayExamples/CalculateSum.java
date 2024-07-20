package TwoDArrayExamples;

public class CalculateSum {

    public static int matrixRowAddition(int [][] matrix){
        int sum=0;
        int rowBegin=1;
        int rowEnd=matrix.length-1;
        int columnBegin=0;
        int columnEnd=matrix[0].length-1;
        for(int i=rowBegin;i<rowEnd;i++){
            sum += matrix[columnBegin][i];
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

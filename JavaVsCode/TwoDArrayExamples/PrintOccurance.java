//Que:>Print occurance of a number in a 2D array

package TwoDArrayExamples;
public class PrintOccurance {

    public static int findOccurance(int [][] matrix){
        int occurance=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    occurance++;
                }
            }
        }

        return occurance;
    }
    public static void main(String[] args) {
       int matrix[][]={{4,7,8},{8,8,7}};
       System.out.println(findOccurance(matrix)); 
    }
}

package TwoDArrayExamples;

public class TransposeMatrix {
    public static void printOrignalMatrix(int [][] matrix){
        System.out.println("Orignal Matrix :");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void findTranspose(int [][]matrix){
        int row=2,column=3;
        int transpsose[][]=new int[column][row];
        for(int i=0;i<row;i++){
               for(int j=0;j<column;j++){
                transpsose[j][i]=matrix[i][j];
               }
        }
        printTranspose(transpsose);
    }
    public static void printTranspose(int [][]transpsose){
        System.out.println("Transpose of the Matrix :");
        for(int i=0;i<transpsose.length;i++){
            for(int j=0;j<transpsose[0].length;j++){
                System.out.print(transpsose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]matrix={
                        {1,2,3},
                        {4,5,6}
                               
                                };
        printOrignalMatrix(matrix);
        findTranspose(matrix);
        
    }
}

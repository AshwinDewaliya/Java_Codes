
//This code is not able to print ArrayList correctly. Correct it!!
package TwoDArrayExamples;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix,List<Integer> res) {
        
        if(matrix.length == 0 ) {
            return res;
        }
        int rowBegin=0;
        int rowEnd=matrix.length-1;;
        int columnBegin=0;
        int columnEnd=matrix[0].length-1;

        while(rowBegin <= rowEnd && columnBegin <= columnEnd ){
            for(int i=columnBegin;i<=columnEnd;i++){
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if(rowBegin<=rowEnd){
            for(int i=columnEnd;i>=columnBegin;i--){
               res.add(matrix[rowEnd][i]);
            }
            }
            rowEnd--;
            if(columnBegin<=columnEnd){
            for(int i=rowEnd;i>=rowBegin;i--){
                res.add(matrix[i][columnBegin]);
            }
            }
            columnBegin++;
        }
        return res;
    }

    public static void printSpiral(List<Integer> res){
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> res=new ArrayList();
        int [][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        spiralOrder(matrix,res);
        printSpiral(res);
         
        
    }
}

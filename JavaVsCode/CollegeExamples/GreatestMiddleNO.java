package CollegeExamples;

public class GreatestMiddleNO {
    
    static int findNumbers(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i] && arr[i+1]>arr[i+2]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {    
          int arr[]={1,2,1,4,5,1};
          System.out.println(findNumbers(arr));    
    }
}

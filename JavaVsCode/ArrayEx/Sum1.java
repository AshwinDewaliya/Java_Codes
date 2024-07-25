package ArrayEx;
public class Sum1 {
    public static void maxArray(int []arr){
        int currSum=0,maxSum=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){
            int end =j;
            currSum=0;
            for(int k=start;k<=end;k++){
                currSum+=arr[k];

            }
            System.out.println("Current sum is : "+currSum);
            if(currSum>=maxSum){
                maxSum=currSum;
            }
            
        }
        
       } 
       System.out.println("Max Sum is : "+maxSum);
       
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxArray(arr);
    }
}
    
    
    


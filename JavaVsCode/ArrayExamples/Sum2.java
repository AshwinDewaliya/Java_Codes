public class Sum2 {

    public static int[] sum2(int []arr,int target){
        int[] newArray=new int[25];
        int curr=0,sum=0;
          for(int i=0;i<arr.length;i++){
            curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
              sum=curr+arr[j];
              if(sum==target){
               for(int k=0;k<arr.length;k++){
                newArray[k]=i;
                newArray[k+1]=j;

               }
                
              }
            }
          }
          return newArray;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        sum2(arr,target);
    
    }
}

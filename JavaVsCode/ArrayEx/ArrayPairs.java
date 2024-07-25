package ArrayEx;
public class ArrayPairs {

    public static void printArr(int []arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                for(int k=curr;k<=j;k++){
                total=curr+arr[j];
                System.out.println(total);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        printArr(arr);
    }
}

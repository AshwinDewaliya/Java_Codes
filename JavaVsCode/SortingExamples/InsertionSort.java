package SortingExamples;

public class InsertionSort {
    public static void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                //swap
                  arr[j+1]=arr[j];
                  j--;
            }
            //insertion
            arr[j+1]=curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
     }

    public static void main(String[] args) {
        int[]arr={2,3,1,4,6,5};
        insertionSort(arr);
        printArr(arr);
    }
}

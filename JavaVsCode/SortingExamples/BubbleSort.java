package SortingExamples;

public class BubbleSort {

    public static void sortElements(int[] arr){
        int swap=0,temp=0;
        for(int turn=0;turn<arr.length-1;turn++){
            
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
                 swap++;
                }
               
            }
            if(swap==0){
                return;
            }
        }
      System.out.println(swap);
    }
    public static void printArr(int arr[]){
       for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        int []arr={1,2,4,56,2};
        sortElements(arr);
        printArr(arr);
    }
}


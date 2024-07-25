package ArrayEx;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1,int m,int[]nums2,int n) {
        int j=0;
    
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            
           
            nums1[i]=nums2[j];
            j++;
           
           
        }

    
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
     }
    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
        printArr(nums1);
    }
}

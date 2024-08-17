package ArrayEx;
import java.util.*;

public class KthLargestElem {
    public static int findelem(int []nums,int k){
        Integer []arr=new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
           System.out.println(Arrays.toString(arr));
                Arrays.sort(arr,Collections.reverseOrder());
        return arr[k-1];
    }
    public static void main(String[] args) {
        int k=2;
        int arr[]={3,2,1,5,6,4};
        System.out.println(findelem(arr,k));
    }
}

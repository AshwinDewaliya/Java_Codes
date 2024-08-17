package ArrayEx;
import java.util.*;

public class ContDuplicates {
    public static boolean containsDuplicate(int []nums){
        Arrays.sort(nums);
        
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                System.out.println(Arrays.toString(nums));
               return true;
              

            }

        }
        return false;
    }
    //The above method exceedes the time therefore below method is used

//     public static boolean containsDuplicate(int []nums){
//         Set<Integer> set=new HashSet<>();
//         for(int num:nums){
//          if(!set.add(num)){
//              return true;
//          }
//           }
//           return false;
//  } 
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,1};
        System.out.println(containsDuplicate(nums));
    }
}

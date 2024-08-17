package ArrayEx;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int n=height.length-1;
        int result=0;
        int left=0;
        int right=n;
        int l_max=0;
        int r_max=0;
        while(left<=right){
           if(r_max<=l_max){
              result+=Math.max(0,r_max-height[right]);
              r_max=Math.max(r_max,height[right]);
              right--;
           }else{
              result+=Math.max(0,l_max-height[left]);
              l_max=Math.max(l_max,height[left]);
              left++;
           }
        }
        return result;
      }
    public static void main(String[] args) {
        int arr[]={3,1,2,4,0,1,3,2};
        System.out.println(trap(arr));
    }
}

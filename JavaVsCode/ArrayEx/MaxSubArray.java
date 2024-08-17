package ArrayEx;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int minValue=Integer.MIN_VALUE;
        int j=0;
        int elem=nums[j];
        for(int i=0;i<nums.length;i++){
            if(sum>minValue){
                sum=sum+nums[i];
            }
            // j++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}

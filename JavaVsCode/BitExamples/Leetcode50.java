public class Leetcode50 {
    public static double myPow(double x, int n) {
        double res=1.0;
        while(n>0){
            if((n & 1)!=0){
                res=res*x;
            }
            n=n>>1;
            x=x*x;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.0000,10));
    }
}

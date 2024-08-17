public class FastExponentition {
    public static int fastExpo(int n,int m){
        int ans=1;
        while(m>0){
            if((m & 1)!=0){
                ans =ans *n;
            }
            n=n*n;
            m=m>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5,3));
    }
}

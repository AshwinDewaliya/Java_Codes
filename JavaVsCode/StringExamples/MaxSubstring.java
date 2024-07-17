public class MaxSubstring {

    public static int maxSubstring(String str){
           int res=-1;
           int diff=-1;
           for(int i=0;i<str.length()-1;i++){
            for(int j=str.length()-1;j>i;j--){
                if(str.charAt(i)==str.charAt(j)){
                    diff=j-i-1;
                    res=Math.max(diff,res);
                }
                
            }
           }
        return res;
    }
  public static void main(String[] args) {
  
    String str="accabbac";
    System.out.println(maxSubstring(str));
  }  
}

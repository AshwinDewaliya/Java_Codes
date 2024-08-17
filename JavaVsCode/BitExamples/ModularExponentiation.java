public class ModularExponentiation {
    public static int superPow(int a, int[] b) {
        int res=1;
        String val="";
        int intVal;
        for(int i=0;i<b.length;i++){
           val= val +String.valueOf(b[i]);
        }    
        intVal=Integer.parseInt(val);
        while(intVal>0){
           if((intVal & 1)!=0){
               res=res*a;
           }
           intVal=intVal>>1;
           a=a*a;
        }
        return res % 1337;
       }
    public static void main(String[] args) {
        int b[]={1,2};
        System.out.println(superPow(2, b));
    }
}

public class FindBit {
    public static void findBit(int a,int i){
       int bitMask =1<<i;
       if((a & bitMask ) ==0){
           System.out.println("ith bit is : 0");
       }else{
        System.out.println("ith bit is : 1");
       
       }
    }
    public static void main(String[] args) {
        findBit(10,3);
    }
}

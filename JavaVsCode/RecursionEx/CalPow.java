package RecursionEx;

public class CalPow {
    public static int findProduct(int a,int b){
          if(b==0){
            return 1;
          }
          return findProduct(a, b-1) *a;
    }
    public static void main(String[] args) {
        System.out.println(findProduct(2,2));
    }
}

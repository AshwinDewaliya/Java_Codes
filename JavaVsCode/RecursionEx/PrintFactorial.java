package RecursionEx;

public class PrintFactorial {
    public static int printFac(int a){
        if(a==1){
            return 1;
        }
        return a*printFac(a-1);
    }
    public static void main(String[] args) {
        System.out.println(printFac(4));
    }
}

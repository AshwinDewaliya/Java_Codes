package RecursionEx;
import java.util.Arrays;
public class PrintFibonacciNo {
    public static void printnos(int n){
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-2]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int printFib(int a){
        if(a==1 || a==0){
           
            return a;
        }
        
        return printFib(a-1)+printFib(a-2);
    }
    public static void main(String[] args) {
        System.out.println(printFib(4));;
        //printnos(5);
    }
}

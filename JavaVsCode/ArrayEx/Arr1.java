package ArrayEx;
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] numbers=new int[5];
        
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be found:");
        int x=sc.nextInt();
          for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==x){
                System.out.println("Element found at :"+i+" index");
            }
          }

    }
}

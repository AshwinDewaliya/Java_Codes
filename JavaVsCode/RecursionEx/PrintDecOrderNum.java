package RecursionEx;

public class PrintDecOrderNum {
    public static void printIncOrder(int a){
        if(a==1){
            System.out.print(a+" ");
            return;
        }
        
        printIncOrder(a-1);
        System.out.print(a+" ");
    }
    public static int printNo(int a){
        if(a==1){
            return 1;
        }
        System.out.print(a+" ");
        return printNo(a-1);
    }
    public static void main(String[] args) {
        System.out.println(printNo(10));
        printIncOrder(10);
    }
}

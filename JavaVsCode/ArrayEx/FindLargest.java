package ArrayEx;
public class FindLargest {
    
        public static int PrintLargest(int numbers[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                 if(numbers[i]>=largest){
                    largest=numbers[i];
                 }
            }  
            return largest;
        }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,8};
        System.out.println(PrintLargest(numbers));

    }
}

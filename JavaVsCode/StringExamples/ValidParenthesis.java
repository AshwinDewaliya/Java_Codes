import java.util.Arrays;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        boolean valP=true;
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        // int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
               valP=false;
               break;
            }else{
                valP=true;
            }
            // j=j+2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return valP;
    }
    
    public static void main(String[] args) {
        String s="({})";
        System.out.println(isValid(s));
        
    }
}

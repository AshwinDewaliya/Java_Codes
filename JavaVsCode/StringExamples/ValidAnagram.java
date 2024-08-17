import java.util.Arrays;

public class ValidAnagram {

    public static boolean isValidAnagram(String s, String t){
        boolean isAnagram=true;
        if(s.length()!=t.length()){
            return isAnagram=false;
        }
        // int i=0;
        int j=0;
        char []arrS= s.toCharArray();
        
        char []arrT=t.toCharArray();
       
       Arrays.sort(arrS);
       Arrays.sort(arrT);
      for(int i=0;i<arrS.length;i++){
         if(arrS[i]!=arrT[j]){
            isAnagram=false;
            break;
        }else{
            isAnagram=true;
        }
        j++;
      }

        return isAnagram;
    }
 public static void main(String[] args) {
    System.out.println(isValidAnagram("rat","car"));
 }   
}

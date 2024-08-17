public class ValidPalendromeLeetcode {

    public  boolean isPalindrome(String s) {
        StringBuilder sb =new StringBuilder();
        boolean isPal=true;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122){
               sb.append(s.charAt(i));
            }
        }
        
        s=sb.toString();
        s=s.toLowerCase();
        System.out.println(s);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                isPal=false;
             break;
         }
            else{
                isPal=true;
                
            }
      }
        
        if(isPal!=true){
            return false;
        }else{
            return true;
        }
        
    }
    public static void main(String[] args) {
        String s="0P";
        ValidPalendromeLeetcode val =new ValidPalendromeLeetcode();
        System.out.println(val.isPalindrome(s));
    }
}

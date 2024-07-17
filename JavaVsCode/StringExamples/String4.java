public class String4 {
    public static boolean compareStrings(String str1,String str2){
              if(str1==str2){
                System.out.println("Strings are same");
                return true;
              }else{
                System.out.println("Strings are not same");
                return false;
              }
    }
    public static void main(String[] args) {
             compareStrings("Ashwin", "Ashwinn");
        }
    }
    

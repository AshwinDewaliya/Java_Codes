public class String13 {
    public static void main(String[] args) {
        String str="Hello User";
        String rev="";
        int i;
        // int end=str.length()-1;
        // int i=str.length();
        for( i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                rev=rev+str.substring(i+1,str.length())+ " ";
            }
        }
        rev=rev+str.substring(0,5);
        
        System.out.println(rev);
    }
    
    }
    
    


public class StringCompression {
    int count;

    public static String compress(String str){
        StringBuilder sb= new StringBuilder("");
      
        for(int i=0;i<str.length()-1;i++){
            Integer count=1;
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                 count++;
                 i++;
           }
           sb.append(str.charAt(i));
           if(count>1){
            sb.append(count.toString());
           }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
         String str="aabbcc";
         System.out.println(compress(str));

    }
        
    
    
    
}

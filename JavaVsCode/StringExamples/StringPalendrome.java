public class StringPalendrome {
    public static void main(String[] args) {
        String str= "naman";
        
        Boolean cond=true;
        for(int i=0;i<str.length()/2;i++){
           
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                   cond=false;
                
            }
        }
        System.out.println(cond);
        if(cond==true){
            System.out.println("String is palendrome");
        }else{
            System.out.println("String is not a palendrome");
            
        }
       
    }
   
}

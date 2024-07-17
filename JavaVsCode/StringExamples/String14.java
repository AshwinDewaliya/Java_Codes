public class String14 {
    public static void firstOccur(String str,char ch){
        int idx=0;
        boolean occur=true;
        for(int i=0;i<str.length();i++){
            idx++;
            if(ch=='b'){
                occur=true;
            }else{
                System.out.println("not found");
                occur=false;
            }
            
        }
        if(occur=true){
            System.out.println("found at "+idx);
        }else System.out.println("not found");
        
    }
    
    public static void main(String[] args) {
        String str="ashwin";
        char ch='a';
        firstOccur(str, ch);
    }
}

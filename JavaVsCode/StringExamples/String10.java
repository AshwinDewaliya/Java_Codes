public class String10 {
    public static void main(String[] args) {
        int wordCount=1;
        String str="i am a man";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                wordCount++;
            }
        }
        System.out.println("Word count is :"+wordCount);
    }
    
}
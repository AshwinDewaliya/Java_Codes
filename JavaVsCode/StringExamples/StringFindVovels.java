public class StringFindVovels {
    public static int find(String str){
        
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            switch (str.charAt(i)) {
                case 'a':
                     count++;
                    break;
                case 'e':
                   count++;
                   case 'i':
                     count++;
                    break;
                case 'o':
                   count++;
                   case 'u':
                     count++;
                    break;
                
                default:
                    break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="ashwin";
        System.out.println(find(str));
    }
    
}

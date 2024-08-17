
//Find out the longest substring without repeating characters

public class Leet3 {

    public static int lengthOfLongestSubstring(String s) {
        int j=1;
        int i=0;
        int count=0;
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j) && s.charAt(j)=='a' && s.charAt(i)!=s.charAt(i-1)) 
            count++;
           
            i++;
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}

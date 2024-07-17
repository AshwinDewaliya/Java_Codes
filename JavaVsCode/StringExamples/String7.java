public class String7 { 
    public static void convert(String str){
          int alphabet=0;
          int digits=0;
          int specChar=0;
          for(int i=0;i<str.length();i++){
             if(str.charAt(i)>32 && str.charAt(i)<47 && str.charAt(i)>58 && str.charAt(i)<64 && str.charAt(i)>91 && str.charAt(i)<96 && str.charAt(i)>123 && str.charAt(i)<126){
                specChar++;
             }else if(str.charAt(i)>48 && str.charAt(i)<57){
                digits++;
             }else{
                alphabet++;
             }
          }
          System.out.println("The given word is:"+str);
          System.out.println("No. of digits are:"+digits);
          System.out.println("No. of special characters are:"+specChar);
          System.out.println("No. of alphabets  are:"+alphabet);       

           
    }
    public static void main(String[] args) {
        String str="This@IsAsT997A";
        convert(str);
            }
        }
    


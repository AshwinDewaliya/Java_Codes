class String11{
    public static void main(String[] args) {
        
        String str="Hello Babu";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
              rev+=str.charAt(i)+"";
              
        }
        System.out.println("Reverse of string is : "+rev);
    }
}
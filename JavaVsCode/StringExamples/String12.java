class String12{
    public static void main(String[] args) {
        String str="racecar";
        boolean isPal=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                isPal=true;
            }else{
                isPal=false;
            }
        }
        if(isPal==true){
            System.out.println("Palendrome");
        }else{
            System.out.println("Not a palendrome");
        }
    }
}
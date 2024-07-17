public class String9 {
    public static void main(String[] args) {
        int vovels = 0;
        int consonents = 0;
        String str = "ashwin";
        for (int i = 0; i < str.length(); i++) {
            // switch (str.charAt(i)) {
            //     case 'a':
            //         vovels++;
            //         break;
            //     case 'e':
            //         vovels++;
            //     case 'i':
            //         vovels++;
            //     case 'o':
            //         vovels++;
            //     case 'u':
            //         vovels++;
            //     default:
            //         consonents++;
            //         break;
            // }
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='a'||str.charAt(i)=='u'){
                vovels++;

            }else{
                consonents++;
            }
        }
        System.out.println("Vovels in the string :"+vovels);
        System.out.println("Consonents in the string :"+consonents);

    }

}

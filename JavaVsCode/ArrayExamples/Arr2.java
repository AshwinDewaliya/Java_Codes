public class Arr2 {

    public static int linearSearch(String[] arr, String key){
        int idx=0;
           for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    
                break;
                }
                idx++;
           }
           return idx;
    }
    public static void main(String[] args) {
        
        String[] arr={"Mango","Banana","Apple","Litchi","Pineapple"};
         String key="Mango";
          System.out.println(linearSearch(arr,key));

    }
}

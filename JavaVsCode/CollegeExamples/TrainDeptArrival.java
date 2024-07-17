package CollegeExamples;

public class TrainDeptArrival {

    public static int calStations(int[] arrival, int[] dept){
        int count=0;
        for(int i=0;i<arrival.length;i++){
            //int currentStation=arrival[i];
            for(int j=0;j<dept.length;j++){
                if (arrival[i] >= arrival[j]
                && dept[j] >= arrival[i]){
                    count ++;
                }
                else{
                    count--;
                }
                 
            }

        }
          return count;
    }
    public static void main(String[] args) {
     int arrival[]={900,940,950,1100,1500,1600};
     int dept[]={910,1120,1130,1200,1900,2000};
     System.out.println(calStations(arrival,dept));   
    }
}

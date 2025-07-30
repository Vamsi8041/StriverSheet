
public class AppearsOnes {
    public static void main(String[] args) {
       int[] arr={1,1,2,2,3,3,4,4,5,5,6};
       int xorr=0;

       for(int i=0;i<arr.length;i++){
         xorr=xorr^arr[i];
       }
       System.out.println(xorr);
    }
}

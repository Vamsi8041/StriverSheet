import java.util.Scanner;


public class LargeElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,5,6,7,1,2,3};
        int MaxNumber=0;
        for(int i=0;i<arr.length;i++){
            if(MaxNumber<arr[i]){
                MaxNumber=arr[i];
            }
        }
        System.out.println(MaxNumber);
    }
}

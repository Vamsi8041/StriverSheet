import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={3,4,5,2,1};
        int n=5;

        for(int i=1;i<n;i++){
            while(arr[i-1]>arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

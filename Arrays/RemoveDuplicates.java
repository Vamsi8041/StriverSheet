import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,3,4,4,4,5,5,6};
        int j=0;
        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[j]){
            j++;
            arr[j]=arr[i];
           }
        }

        for(int i=0;i<=j;i++){
            System.out.println(arr[i]);
        }
    }
}

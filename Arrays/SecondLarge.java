import java.util.Scanner;


public class SecondLarge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr={1,2,1,2,1,3,4,4,5,5};
        int LargeElement=Integer.MAX_VALUE;
        int SecondLargeElemant=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>LargeElement){
                SecondLargeElemant=LargeElement;
                LargeElement=arr[i];
            }else if(arr[i]>SecondLargeElemant && arr[i]!=LargeElement){
                SecondLargeElemant=arr[i];
            }
        }

        System.out.println(SecondLargeElemant);
    }
}

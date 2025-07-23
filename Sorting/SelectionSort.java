import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={5,4,3,2,5,1};
        for(int i=0;i<arr.length-1;i++){
            int SmallNumber=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[SmallNumber]){
                    SmallNumber=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[SmallNumber];
            arr[SmallNumber]=temp;
    }
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
}
}

import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,4,5,6,7,8};
        int n=arr.length+1;
        int TotalSum=(n*(n+1))/2;
        int arraysum=0;
        for(int num : arr){
            arraysum+=num;
        }
        System.out.println(TotalSum-arraysum);
    }
}

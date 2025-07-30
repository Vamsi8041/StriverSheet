import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,9,8,9};
        boolean istrue=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                istrue=false;
            }
        }      
        System.err.println(istrue);
    }
}

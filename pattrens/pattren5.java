// Input Format: N = 6
// Result:
// * * * * * *
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
import java.util.*;

public class pattren5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.err.print("*"+" ");
            }
            System.err.println();
        }
    }
}

// Input Format: N = 6
// Result:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 6 6 6 6 6 6

import java.util.*;
public class pattren4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.err.print(i+1+" ");
            }
            System.err.println();
        }
    }
}

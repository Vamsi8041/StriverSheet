// Input Format: N = 6
// Result:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6


import java.util.*;
public class pattren3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.err.print(j+1+" ");
            }
            System.err.println();
        }
    }
}

// Input Format: N = 6
// Result:
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1

import java.util.Scanner;

public class pattren6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}

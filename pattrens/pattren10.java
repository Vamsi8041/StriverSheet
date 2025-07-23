// Input Format: N = 6
// Result:   
//      *
//      **
//      *** 
//      ****
//      *****
//      ******  
//      *****
//      ****
//      ***    
//      **
//      *

import java.util.Scanner;

public class pattren10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

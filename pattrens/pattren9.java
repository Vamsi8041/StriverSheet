// Input Format: N = 6
// Result:   
//      *
//     ***
//    ***** 
//   *******
//  *********
// ***********  
// ***********
//  *********
//   *******
//    ***** 
//     ***    
//      *


import java.util.Scanner;

public class pattren9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

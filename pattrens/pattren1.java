// Input: N = 3
// Output: 
// * * *
// * * *
// * * *


import java.util.*;
class Pattern1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.err.print("*"+" ");
            }
            System.err.println();
        }
    }
}
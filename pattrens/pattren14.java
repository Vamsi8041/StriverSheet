// Input Format: N = 6
// Result:   
// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F

import java.util.Scanner;

public class pattren14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=65;
            for (int j=0;j<=i;j++){
                System.out.print((char) num +" ");
                num++;
            }
            System.out.println();
        }
    }
}

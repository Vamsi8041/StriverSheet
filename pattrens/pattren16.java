// Input Format: N = 6
// Result:   
// A 
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F

import java.util.Scanner;

public class pattren16{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        int num=65;
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char) num +" ");
               
            }
            num++;
            System.out.println();
        }
    }
}

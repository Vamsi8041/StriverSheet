import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the n1:");
        int n1=sc.nextInt();
        System.out.print("Enter the n2:");
        int n2=sc.nextInt();

        // int gcd=1;

        // for(int i=1;i<=Math.min(n1,n2);i++){
        //     if(n1%i==0 && n2%i==0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);

        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }

        if(n1==0){
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }
    }
}

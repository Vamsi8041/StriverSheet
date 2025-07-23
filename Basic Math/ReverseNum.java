import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter");
        int n=sc.nextInt();

        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10;
            rev+=digit;
            n=n/10;
        }

        if(n<0){
            System.out.println((int)(-1*rev));
        }else{
            System.out.println((int)(rev));
        }
    }
}

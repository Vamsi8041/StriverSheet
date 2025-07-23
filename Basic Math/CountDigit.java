import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter ");
       int n=sc.nextInt();

       int cnt=(int) (Math.log10(n)+1);
       System.err.println(cnt);
    }
}

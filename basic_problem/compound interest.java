import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();
        double amount = principal;
        amount *= 1+r1/100;
        amount *= 1+r2/100;
        amount *= 1+r3/100;
        double interest = amount - principal;
        System.out.print(interest);
    }
}

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int p =1;
        while(n!=0){
            int l = n%10;
            sum += l;
            p *= l;
            n = n/10;
        }
        System.out.print((sum==p)?"Spy num":"Not a spy num");
    }
}

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int t =0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                c++;
            }
            if(c==1){
                t = n;
            }
        }
        System.out.print(t);
        int rev =0;
        while(t != 0){
            int d = t%10;
            rev = rev*10+d;
           t=t/10;
        }
        int m =0;
        for(int i=1;i<=rev;i++){
            if(rev%i == 0){
                m++;
            }
        }
        if(c == 1 && m == 1){
            System.out.print("Twisted Prime Number");
        }
        else{
            System.out.println("Not Twisted Prime Number");
        }
    }
}

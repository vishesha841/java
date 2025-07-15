import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum =0;
        while(n != 0){
            int d = n%10;
            sum +=d*d*d;
            n = n/10;
        }
        if(original == sum){
            System.out.print("ArmStrong Number");
        }
        else{
            System.out.print("Not ArmStrong Number");
        }
    }
}

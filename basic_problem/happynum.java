import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 1){
        int sum =0;
        int temp = n;
        while(temp !=0){
            int d = temp%10;
            sum += d*d;
            temp = temp/10;
            
        }
        
        n = sum;
    }
        if(n == 1){
            System.out.print("Not Happy NUmber");
        }
        else{
            System.out.print("Happy Number");
        }
     
    }
}

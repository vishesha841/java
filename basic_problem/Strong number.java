import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int original = num;
       int sum =0;
       
       while(num != 0){
           int digit = num%10;
           int fact =1;
           for(int i=1;i<=digit;i++){
               fact = fact*i;
           }
           sum = sum+fact;
           num = num/10;
       }
      
      if(sum == original){
          System.out.print("Yes");
      }
      else{
          System.out.print("no");
      }
    }
}

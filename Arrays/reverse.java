import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         int k = sc.nextInt();
         for(int i =k-1;i>=0;i--){
             System.out.print(s.charAt(i));
         }
         for(int i = k;i<s.length();i++){
             System.out.print(s.charAt(i));
         }
    }
}

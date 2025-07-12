import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m [] = new int [7];
        for(int i=0;i<7;i++){
            m[i] = sc.nextInt();
        }
        int t=0;
        for(int i=0;i<7;i++){
          t = m[i]+n;
          System.out.print(t);
        }
        
    }
}

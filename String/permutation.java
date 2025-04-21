import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for(int i =0;i<=n;i++){
            for(int j =i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
i/p     
abc     
o/p
a,ab,abc,ac,b,bc,c

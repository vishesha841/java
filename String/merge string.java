import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = s1.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char c = s1.charAt(i);
            char ne = s2.charAt(i);
            sb.append(c);
            sb.append(ne);
            
        }
        System.out.print(sb.toString());
    }
}

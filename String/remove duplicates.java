import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<n;i++){
            if(s.charAt(i) != s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
}

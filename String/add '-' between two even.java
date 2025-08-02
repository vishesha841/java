import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for(int i=0;i<n-1;i++){
            char c = s.charAt(i);
            char ne = s.charAt(i+1);
            int cur = c-'0';
            int nex = ne -'0';
            sb.append(c);
            if(cur%2!=0 || nex%2!=0){
                flag = 1;
                break;
            }
            else{
                sb.append('-');
            }
        }
        if(flag == 0){
            sb.append(s.charAt(n-1));
            System.out.print(sb.toString());
        }
        else{
            System.out.print(s);
        }
    }
}

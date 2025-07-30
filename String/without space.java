import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
          if(ch[i] != ' '){
              sb.append(ch[i]);
          }
        }
        System.out.print(sb.toString());
    }
}

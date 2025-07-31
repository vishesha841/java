import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >='a' &&  ch<='z'){
                sb.append((char)(ch-32));
            }
            else if(ch >='A' &&  ch<='Z'){
                sb.append((char)(ch+32));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }
}

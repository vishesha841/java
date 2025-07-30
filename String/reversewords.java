import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] word = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String words : word){
            StringBuilder sb = new StringBuilder();
            for(int i=words.length()-1;i>=0;i--){
                sb.append(words.charAt(i));
            }
            res.append(sb.append(" "));
        }
        System.out.print(res.toString());
    }
}

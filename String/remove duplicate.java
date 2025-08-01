import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int a [] = new int[256];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int ascii = (int)(ch);
            a[ascii]++;
        }
        boolean added[] = new boolean[256];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(a[ch] >=1 && !added[ch]){
                sb.append(ch);
                added[ch] = true;
            }
        }
        System.out.print(sb.toString());
    }
}

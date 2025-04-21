import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int a[] = new int [256];
        int max = 0;
        char maxch = 0;
        for(int i =0;i<n;i++){
         char ch = s.charAt(i);
            a[ch]++;
            if(a[ch] >= max){
                max = a[ch];
                maxch = ch;
            }
        }
        System.out.println(max);
        System.out.println(maxch);
        
    }
}

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char ch[] = s.toCharArray();
        int a[] = new int[256];
        for(int i=0;i<n;i++){
            int ascii = (int)(ch[i]);
            a[ascii]++;
        }
        for(int i=0;i<256;i++){
            if(a[i]>0){
                System.out.println((char)i+""+a[i]);
            }
        }
    }
}

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        int a1[] = new int[256];
        int a2[] = new int[256];
        for(int i=0;i<n1;i++){
            int ascii = (int)(ch1[i]);
            a1[ascii]++;
        }
        for(int i=0;i<n2;i++){
            int fre = (int)(ch2[i]);
            a2[fre]++;
        }
        int flag =0;
        for(int i=0;i<256;i++){
            if(a1[i] != a2[i]){
                flag =1;
                break;
            }
        }
        if(flag == 0){
            System.out.print("Anagram");
        }
        else{
            System.out.print("Not a Anagram");
        }
        
    }
}

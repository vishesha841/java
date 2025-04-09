import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len1 = s1.length();     // string equal
        int len2 = s2.length();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        if(len1 == len2){
            int flag = 0;
            for(int i =0;i<=len1-1;i++){
                if(ch1[i] != ch2[i]){
                    flag = 1;
                    break;
                }
            
            }
            if(flag == 0){
                System.out.print("equal");
            }
            else{
                System.out.print("not equal");
            }
        }
        else{
            System.out.print("not equal");
        }
        
        
    }
}

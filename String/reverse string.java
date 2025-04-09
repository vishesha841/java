import java.util.*;
public class Main{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();           
        char ch [] = s.toCharArray();
        char t;
        int n = len-1;
        for(int i = 0;i < len/2;i++){
            t = ch[i];
            ch[i] = ch[n];
            ch[n] = t;
            n--;
            
        }
        String res = new String(ch);
        System.out.print(res);
    }
    
}
        
        
  

 import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char ch[] = s.toCharArray();
        int v =0;
        for(int i=0;i<n;i++){
            if(ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||
            ch[i] == 'u'){
                v++;
            }
        }
        System.out.println(v);
        for(int i=0;i<n;i++){
            if(ch[i] != 'a'&&ch[i] != 'e'&&ch[i] != 'i'&&ch[i] != 'o'&&
            ch[i] != 'u'){
             System.out.print(ch[i]);
              
            }
        }   
        
    }
}

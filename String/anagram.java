import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 == len2){
        char ch1 [] = s1.toCharArray();
        char ch2 [] = s2.toCharArray();
        int a1[] = new int[256];
        int a2[] = new int [256];
            
        for(int i =0;i <= len1-1;i++){
           int ascii;
           ascii = (int)(ch1[i]);
           a1[ascii]++;
           ascii = (int)(ch2[i]);
           a2[ascii]++;
        }
      
      int flag =0;
      for(int i =0;i < 256;i++){
       if(a1[i] != a2[i]){
           flag =1;
           break;
       }   
     }
      if(flag == 0){
          System.out.print("Anagram");
      }
      else{
          System.out.print("not an anagram");
      }
    }
     else{
         System.out.print("not an anagram");
     } 
    
    }
}

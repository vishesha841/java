import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        char ch [] = s.toCharArray();
        int sum;
        int ts =0;
        for(int i =0;i <= len-1;i++){
            sum=0;
            if(ch[i] >= '0' && ch[i] <='9'){
                while(i<len && ch[i] >= '0' && ch[i] <= '9'){
                    sum = sum*10+((int)(ch[i]) - 48);
                    i++;
                }
                ts = ts+sum;
            }
        }
        System.out.println(ts);
    }
}

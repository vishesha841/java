import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int d =0;
        int base = 1;
        for(int i=b.length()-1;i>=0;i--){
            char digit = b.charAt(i);
            if(digit == '1'){
                d +=base;
            }
            base = base*2;
        }
        System.out.print(d);
    }
}

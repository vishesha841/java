import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<n1;i++){
            char ch = s1.charAt(i);
            if(ch >='0' && ch <='9'){
                sb1.append(ch);
            }
        }
        for(int i=0;i<n2;i++){
            char ch = s2.charAt(i);
            if(ch >='0' && ch <='9'){
                sb2.append(ch);
            }
        }
        int num1 = Integer.parseInt(sb1.toString());
        int num2 = Integer.parseInt(sb2.toString());
        
        if(num1 == num2){
            System.out.print("Not Changed");
        }
        if(num1 > num2){
            System.out.print("Downgraded");
        }
        if(num1 < num2){
            System.out.print("upgraded");
        }
        
    }
}

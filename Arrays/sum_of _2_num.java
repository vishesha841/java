import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                int t = a[i] +a[j];
                if(t == k){
                    System.out.print(a[i]+" "+a[j]);
                    System.out.println();
                }
            }
        }
    }
}

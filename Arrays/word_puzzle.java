import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char a[][] = new char [r][c];
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                a[i][j] = sc.next().charAt(0);
            }
        }
        char k = sc.next().charAt(0);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);
        boolean isFound = false;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(a[i][j] == k){
                    if ((j + 1 < c && a[i][j + 1] == x) ||
                        (j - 1 >= 0 && a[i][j - 1] == x) ||
                        (i + 1 < r && a[i + 1][j] == x) ||
                        (i - 1 >= 0 && a[i - 1][j] == x)){
                        if ((j + 1 < c && a[i][j + 1] == y) ||
                            (j - 1 >= 0 && a[i][j - 1] == y) ||
                            (i + 1 < r && a[i + 1][j] == y) ||
                            (i - 1 >= 0 && a[i - 1][j] == y)){
                            isFound = true;
                        }
                    }
                    
                    
                }
            }
        }
        if(isFound = true){
            System.out.print("found");
        }
        else{
            System.out.print(" Not found");
        }
        
    }
}

i/p:
A B C
D E F
G H I
keys:
E
B
F
o/p:
found
  

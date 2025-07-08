import java.util.*;
public class Main{
    public static void main(String args[]){
        Vector<String> v = new  Vector<>();
        v.add("orange");
        v.add("apple");
        v.add("mango");
        v.add("pineapple");
        
        System.out.println("B V :"+ v);
        System.out.println( v.get(3));
        v.addFirst("pineapple");
        v.addLast("orange");
        System.out.println(v);
        System.out.println(v.contains("lichi"));
        v.remove("pineapple");
        System.out.println(v);
        v.removeFirst();
        v.removeLast();
        System.out.println("A F"+v);
        v.clear();
        System.out.println(v);
        
    }
}

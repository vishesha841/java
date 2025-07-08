import java.util.*;
public class Main{
    public static void main(String args[]){
        LinkedList<Integer> l = new  LinkedList<>();
        l.add(5);
        l.add(4);
        l.addFirst(3);
        l.addLast(2);
        l.add(1);
        System.out.println("b L:" +l);
        l.removeLast();
        System.out.println("r L:" +l);
        l.removeFirst();
        System.out.println("r f:" +l);
        System.out.println(l.get(2));
        System.out.println("A list: "+l);
        
        
        
    }
}

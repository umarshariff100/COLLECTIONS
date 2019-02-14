
import java.util.Iterator;
import java.util.LinkedList;


public class VectorCollections6 {
    public static void main(String[] args){
        LinkedList v = new LinkedList();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        Iterator itr = v.descendingIterator();
        while(itr.hasNext()== true){
            System.out.println(itr.next());
        }
    }
}


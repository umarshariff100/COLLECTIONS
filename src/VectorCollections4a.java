
import java.util.ListIterator;
import java.util.Vector;


public class VectorCollections4a {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        ListIterator litr = v.listIterator(v.size());
        while(litr.hasPrevious()== true){
            System.out.println(litr.previous());
        }
    }
}


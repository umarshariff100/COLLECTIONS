
import java.util.Iterator;  //USING ITERATOR
import java.util.Vector;


public class VectorCollections3 {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        Iterator itr = v.iterator();
        while (itr.hasNext()== true)
        {
            System.out.println(itr.next());
        
    }
    }
}

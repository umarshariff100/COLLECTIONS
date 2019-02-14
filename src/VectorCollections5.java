
import java.util.Enumeration;
import java.util.Vector;


public class VectorCollections5 {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        Enumeration e;
        e = v.elements();
        while(e.hasMoreElements()== true){
            System.out.println(e.nextElement());
        }
    }
}



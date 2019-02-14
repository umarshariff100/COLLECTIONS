
import java.util.Vector;


public class VectorCollection2{
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        v.forEach((x) -> {
            System.out.println(x);
        });
        /* for(Object x:v){
        System.out.println(x);
    }*/
    }
}

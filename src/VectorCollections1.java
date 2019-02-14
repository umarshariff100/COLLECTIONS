
import java.util.Vector;


public class VectorCollections1 {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        for(int i=0; i<=v.size()-1;++i){
            System.out.println(v.get(i));
            
        }
    }
}

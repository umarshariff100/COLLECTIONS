
import java.util.ArrayList;


public class Collections2 {
    public static void main(String[] args){
        ArrayList al1;
        al1 = new ArrayList();
        
        al1.ensureCapacity(25);
        al1.add(10);
        al1.add(20);
        al1.add(30);
        System.out.println(al1.size());
        al1.trimToSize();
        System.out.println(al1.size());
    }
}

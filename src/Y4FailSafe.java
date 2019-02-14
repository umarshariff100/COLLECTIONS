
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class Y4FailSafe {
    public static void main(String[] args){
        CopyOnWriteArrayList v = new CopyOnWriteArrayList();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        
        Iterator itr = v.iterator();
        while (itr.hasNext()== true)
        {
            System.out.println(itr.next());
            v.add(100);
        
    }
    }
}

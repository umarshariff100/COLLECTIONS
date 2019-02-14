
import java.util.ArrayDeque;


public class DQCollections1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        ArrayDeque dq = new ArrayDeque();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        System.out.println(dq);
        
        dq.addLast(100);
        dq.addLast(200);
        dq.addLast(300);
        
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        
        dq.offerFirst(9);
        dq.offerLast(99);
        System.out.println(dq);
        
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);
        
        System.out.println(dq.pollFirst());
        
        System.out.println(dq.pollLast());
        
        System.out.println(dq);
    }
    
}

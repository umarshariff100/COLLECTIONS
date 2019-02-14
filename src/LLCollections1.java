
import java.util.LinkedList;


public class LLCollections1 {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);             ///add inserts the data into the LinkedList cumpolsaryly 
        ll.addFirst(20);                
        ll.addFirst(30);
        System.out.println(ll);
        
        ll.addLast(100);
        ll.addLast(200);
        ll.addLast(300);
        
        System.out.println(ll);
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getClass());
        System.out.println(ll.getLast());
                
        
        ll.offerFirst(9);
        ll.offerLast(99);
        System.out.println(ll);
        
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        
        System.out.println(ll);
        
        
        System.out.println(ll.pollFirst());
        
        System.out.println(ll);
        
        System.out.println(ll.pollLast());
        System.out.println(ll);
        
        System.out.println(ll.pop());
        System.out.println(ll);
        
        System.out.println(ll.poll());
        System.out.println(ll);
         ll.addLast(100);
        ll.addLast(200);
        ll.offer(1000);             ///Offer will add the data into the LinkedList if and only if memory is available
        
        System.out.println(ll);
        
    }
    
}

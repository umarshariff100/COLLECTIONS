
import java.util.ArrayList;




public class Collections1 {
 public static void main(String[] args){
     ArrayList al1 = new ArrayList();
     al1.add(10);
     al1.add(20);
     al1.add(30);
     al1.add(40);
     System.out.println(al1);
     
     
     ArrayList al2 = new ArrayList();
     al2.add(9);
     al2.add(99);
     al2.add(999);
     System.out.println(al2);
     al1.addAll(3, al2);
     
     System.out.println(al1);
     System.out.println(al1.containsAll(al2));
     System.out.println(al2.contains(al1));
     System.out.println(al1.get(0));
     System.out.println(al1.getClass());
     
     System.out.println(al1.hashCode());
      System.out.println(al1.indexOf(999));
      System.out.println(al1.listIterator());
      
      System.out.println(al1.isEmpty());
      System.out.println(al1.lastIndexOf(30));
      al1.set(5, 666);
      System.out.println(al1);
      System.out.println(al1.size());
      System.out.println(al1.removeAll(al2));
      System.out.println(al1);
      System.out.println(al2.isEmpty());
      al2.clear();
      System.out.println(al2);
      System.out.println(al2.isEmpty());
      System.out.println(al1.subList(1, 4));
      
      
      
 }   
}

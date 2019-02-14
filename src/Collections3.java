
import java.util.ArrayList;


public class Collections3 {
    public static void main(String[] args){
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        
        
        ArrayList al2 = new ArrayList();
        al2.add(9);
        al2.add(19);
        al2.add(29);
        al2.add(40);
        al2.add(50);
        
        System.out.println(al1);
        System.out.println(al2);
        
        al1.retainAll(al2);
        
        System.out.println(al1);
    }
    
}

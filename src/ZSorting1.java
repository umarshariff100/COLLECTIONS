
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class ZSorting1 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(22);
        hs.add(83);
        hs.add(56);
        hs.add(92);
        hs.add(80);
        
        System.out.println(hs);
        
        ArrayList al = new ArrayList();
        al.addAll(hs);
        
      
         Collections.sort(al);
       
        
        System.out.println(al);
    }

}

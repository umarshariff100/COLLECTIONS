
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ZReverseSorting2 {
    public static void main(String[] args){
        ArrayList<Integer> al;
        al = new ArrayList<Integer>();
        al.add(22);
        al.add(83);
        al.add(56);
        al.add(92);
        al.add(80);
        al.add(81);
        
        System.out.println(al);
        
        
         Comparator C = Collections.reverseOrder();
         Collections.sort(al, C);
       
        
        System.out.println(al);
    }
}

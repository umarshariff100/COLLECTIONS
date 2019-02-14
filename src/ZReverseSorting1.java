
import java.util.ArrayList;
import java.util.Collections;


public class ZReverseSorting1 {
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
        
        Collections.sort(al);
        Collections.reverse(al);
        
        System.out.println(al);
    }
}

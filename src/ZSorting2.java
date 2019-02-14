
import java.util.ArrayList;
import java.util.Collections;


public class ZSorting2 {
    public static void main(String[] args){
        ArrayList al =  new  ArrayList();
        al.add(22);
        al.add(23);
        al.add(36);
        al.add(42);
        al.add(50);
        System.out.println(al);
        
        System.out.println(Collections.binarySearch(al, 23));
        System.out.println(Collections.binarySearch(al, 200)); //if the key is not found then the binary search method returns a -ve Value//
        
        
        
    }
}

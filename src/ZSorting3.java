
import java.util.ArrayList;
import java.util.Collections;


public class ZSorting3 {
    public static void main(String[] args){
        ArrayList al =  new  ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(30);
        al.add(60);
        al.add(30);
        al.add(45);
        
        System.out.println(al);
        
        
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
        
        
        Collections.rotate(al, 2);
        System.out.println(al);
        
        System.out.println(Collections.frequency(al, 10));
        
        
    }
}



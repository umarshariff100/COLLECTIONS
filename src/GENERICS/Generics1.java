
package GENERICS;

import java.util.ArrayList;
import java.util.Collections;


public class Generics1 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Anil");
        al.add("Sunday");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
    
}

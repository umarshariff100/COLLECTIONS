
package GENERICS;

import java.util.ArrayList;
import java.util.Collections;


class Cricketer{
    public String name;
    int runs;
    float avg;
    Cricketer(String name, int runs, float avg){
        this.name = name;
        this.runs = runs;
        this.avg = avg;
    }
    public String getName(){
        return name;
    }
    public int getRuns(){
        return runs;
    }
    public float getAvg(){
        return avg;
    }
    public String ToString(){
        return name + "" + runs + "" + avg;
    }
}

public class Generics4 {
    public static void main(String[] args){
        Cricketer C1 = new Cricketer("Anil", 4000 , 20.5f);
        Cricketer C2 = new Cricketer("Sunil", 1000 , 10.5f);
        Cricketer C3 = new Cricketer("Dhoni", 2000 , 30.5f);
        
        ArrayList<Cricketer> al = new ArrayList<Cricketer>();
        al.add(C1);
        al.add(C2);
        al.add(C3);
        System.out.println(al);
        Collections.sort(al);                   /*ERROR*/
        System.out.println(al);
        
    }
}

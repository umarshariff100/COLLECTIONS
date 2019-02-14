
package GENERICS;

import java.util.*;



class Cricketer10  {
    public String name;
    int runs;
    float avg;
    Cricketer10(String name, int runs, float avg){
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

class Comp implements Comparator{
    @Override
    public int compare(Object x, Object y){
        ((Cricketer10)(x)).runs>(Cricketer10)(x)).runs){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class Generics6{
    public static void main(String[] args){
        Cricketer1 C1 = new Cricketer10("Anil", 4000 , 20.5f);
        Cricketer1 C2 = new Cricketer10("Sunil", 1000 , 10.5f);
        Cricketer1 C3 = new Cricketer10("Dhoni", 2000 , 30.5f);
        
        ArrayList<Cricketer10> al = new ArrayList<Cricketer10>();
        al.add(C1);
        al.add(C2);
        al.add(C3);
        System.out.println(al);
        Comp C = new Comp();
        
        Collections.sort(al);
        
        System.out.println(al);
        
    }


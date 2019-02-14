



import java.util.*;



class Cricketer1 implements Comparable {
    String name;
    int runs;
    float avg;
    Cricketer1(String name, int runs, float avg){
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
    @Override
    public String toString(){
        return name + "" + runs + "" + avg;
    }
    
    @Override
    public int compareTo(Object y){
        if( this.avg > ((Cricketer1)(y)).avg ){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class UGenerics1 {
    public static void main(String[] args){
        Cricketer1 C1 = new Cricketer1("Anil", 4000 , 20.5f);
        Cricketer1 C2 = new Cricketer1("Sunil", 1000 , 10.5f);
        Cricketer1 C3 = new Cricketer1("Dhoni", 2000 , 30.5f);
        
        ArrayList <Cricketer1> al = new ArrayList <Cricketer1> ();
        al.add(C1);
        al.add(C2);
        al.add(C3);
        System.out.println(al);
        
        Collections.sort(al);
        
        System.out.println(al);
        
    }
}

    


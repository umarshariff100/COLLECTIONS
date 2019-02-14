



import java.util.*;



class Cricketer10 implements Comparator {
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
    
    @Override
    public int compare(Object x, Object y){
         if(((Cricketer10)(x)).runs > ((Cricketer10)(y)).runs){
             return 1;
         }
        else{
             return -1;
         }
    }
}

public class Generics6 {
    public static void main(String[] args){
        Cricketer10 C1 = new Cricketer10("Anil", 4000 , 20.5f);
        Cricketer10 C2 = new Cricketer10("Sunil", 1000 , 10.5f);
        Cricketer10 C3 = new Cricketer10("Dhoni", 2000 , 30.5f);
        
        ArrayList <Cricketer10> al = new ArrayList <Cricketer10> ();
        al.add(C1);
        al.add(C2);
        al.add(C3);
        System.out.println(al);
        
       Collections.sort(al);
        
        System.out.println(al);
        
    }
}

    


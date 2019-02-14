
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Player11{
String name;
int runs;
float avg;
int catches;
float height;
float weight;
String addr;

public Player11(String name, int runs, float avg,int catches, float height, float weight, String addr){
    this.name = name;
    this.runs = runs;
    this.avg = avg;
    this.catches = catches;
    this.height= height;
    this.weight = weight;
    this.addr = addr;
    }
@Override
    public String toString(){
    return name + "" + runs + "" + avg + "" + catches + "" + height + "" + weight + "" + addr;
}
}
public class ZZMap3 {
    
    public static void main(String[] args){
        Player11 C1 = new Player11("Sachin", 40000, 50.5f, 400, 5.4f, 55.5f, "Mumbai");
        
        Player11 C2 = new Player11("Dhoni", 36900, 20.5f, 150, 6.4f, 65.5f, "Bangalore");
        
        Player11 C3 = new Player11("Virat", 25000, 30.5f, 300, 7.4f, 45.5f, "INDIA");
        Player11 C4 = new Player11("Sehwag", 100000, 60.5f, 330, 8.4f, 60.5f, "Bengaluru");
        
        HashMap hm;
        hm = new HashMap();
        
        hm.put(101, C1);
        hm.put(102, C2);
        hm.put(103, C3);
        hm.put(104, C4);
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        
        while (itr.hasNext()== true){
             System.out.println(itr.next());
        }
       
    }
    
}

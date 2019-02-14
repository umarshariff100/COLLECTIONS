
import java.util.HashMap;

class Player{
String name;
int runs;
float avg;
int catches;
float height;
float weight;
String addr;

public Player(String name, int runs, float avg,int catches, float height, float weight, String addr){
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
public class ZZMaps1 {
    
    public static void main(String[] args){
        Player C1 = new Player("Sachin", 40000, 50.5f, 400, 5.4f, 55.5f, "Mumbai");
        
        Player C2 = new Player("Dhoni", 36900, 20.5f, 150, 6.4f, 65.5f, "Bangalore");
        
        Player C3 = new Player("Virat", 25000, 30.5f, 300, 7.4f, 45.5f, "INDIA");
        Player C4 = new Player("Sehwag", 100000, 60.5f, 330, 8.4f, 60.5f, "Bengaluru");
        
        HashMap hm;
        hm = new HashMap();
        
        hm.put(1, C1);
        
        System.out.println();
        
        hm.put(2, C2);
        
        System.out.println();
        
        hm.put(3, C3);
        
        System.out.println();
        hm.put(5, C4);
        
        System.out.println(hm);
    }
    
}

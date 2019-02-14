
import java.util.TreeSet;



public class TSCollection1 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(26);
        ts.add(75);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        ts.add(10);
        ts.add(999);
        System.out.println(ts);
        
        System.out.println(ts.first());
        
        System.out.println(ts.last());
        System.out.println(ts.headSet(100));
        System.out.println(ts.tailSet(100));
        System.out.println(ts.ceiling(110));
        System.out.println(ts.floor(110));
        System.out.println(ts.higher(110));
        System.out.println(ts.lower(110));
        System.out.println(ts.ceiling(100));
        System.out.println(ts.floor(100));
        System.out.println(ts.higher(100));
        System.out.println(ts.lower(100));
/*[10, 25, 50, 75, 100, 125, 150, 175]
10
175
[10, 25, 50, 75]
[100, 125, 150, 175]
125
100
125
100
100
100
125
        */
            
        }
    }
    


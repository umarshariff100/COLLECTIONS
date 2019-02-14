
import java.util.PriorityQueue;


public class PQCOllection1 {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();
        pq.add(56);             //internally makes use of MinHeap data Structure
        pq.add(25);
        pq.add(83);
        pq.add(24);
        pq.add(19);
        pq.add(16);
        pq.add(45);
        pq.add(10);
        pq.add(9);
        
        System.out.println(pq);
            
        }
    }


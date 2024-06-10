import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        //FIFO
        Queue<String> fila = new PriorityQueue<>(Collections.reverseOrder());


        fila.offer("A");
        fila.offer("C");
        fila.offer("A");
        fila.offer("F");
        fila.offer("D");

        while(!fila.isEmpty()){
            System.out.println(fila.poll());

        }
    }
}

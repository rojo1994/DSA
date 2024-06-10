import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // FIRST IN FIRST OUT  FIFO
        //add           , offer         , enqueue
        //remove        , poll          , dequeue

        Queue<String> fila = new LinkedList<String>();



        fila.offer("Karen");
        fila.offer("Chad");
        fila.offer("Steve");
        fila.offer("Harold");
        //System.out.println(fila.isEmpty());
        //System.out.println(fila.peek());
        //System.out.println(fila.size());
        //System.out.println(fila.contains("Harold"));

        //fila.poll();
        //fila.poll();
        //fila.poll();
        //fila.poll();


        System.out.println(fila);






    }
}

import java.util.*;

public class QueueCRUD {
    public static void main(String[] args){
        //FIFO Queue
        Queue <Integer> q = new LinkedList<>();

        //adding elements
        q.offer(1);
        q.offer(2);

        // head will be printed
        System.out.println(q.peek());

        //removing the element
        System.out.println(q.poll());

        //head will be printed
        System.out.println(q.peek());

        //checks whether the queue is empty or not
        System.out.println(q.isEmpty());
    }
}

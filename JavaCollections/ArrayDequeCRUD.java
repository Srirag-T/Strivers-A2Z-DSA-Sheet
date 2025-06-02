import java.util.*;

public class ArrayDequeCRUD {
    public static void main(String[] args){
        Deque <Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);

        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq.peekFirst());
        System.out.println(dq);
    }
}

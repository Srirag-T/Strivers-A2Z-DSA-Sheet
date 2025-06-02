import java.util.*;

public class StackCRUD {
    public static void main(String[] args){
        // LIFO
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

       while(!stack.isEmpty()){
           System.out.println(stack.peek());
           stack.pop();
       }
    }
}

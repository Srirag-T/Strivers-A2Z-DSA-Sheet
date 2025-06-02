import java.util.*;

public class SetCRUD {
    public static void main(String[] args){
        Set <Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);

        Set <Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        // add all
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);

        //interaction
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        //remove all
        set1.removeAll(set2);
        System.out.println(set1);
        System.out.println(set2);
    }
}

import java.util.*;

public class LinkedListCRUD {
  public static void main(String[] args){
      List <Integer> linkList = new LinkedList<>();
      linkList.add(1);
      linkList.add(2);
      linkList.add(3);

//    [1,2,3]
      ListIterator <Integer> iterator = linkList.listIterator();

      System.out.println(iterator.next());
      System.out.println(iterator.hasNext());
      System.out.println(iterator.previous());

      // next - return items[index++]
      // prev - return items[--index]

  }
}

import java.util.ArrayList;
import java.util.List;
public class ArrayListCRUD {
    public static void main(String[] args){
        List <Integer> alist  = new ArrayList<>();

        //add elements into ArrayList
        alist.add(1);
        alist.add(2);

        //Convert ArrayList into array based on the problem given in leetcode if there is return array
        Integer [] arr = alist.toArray(new Integer[0]);

        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();

        //change particular position
//        System.out.println("Element that got replaced = "+alist.set(1,100));
//        System.out.println("This is main ArrayList -> "+alist);

        //copying ArrayList elements into another ArrayList

//        List <Integer> alist2 = new ArrayList<>(alist);
//        System.out.println("This is copied ArrayList -> "+alist2);


        // adding all elements of ArrayList into ArrayList2

        List <Integer> alist2 = new ArrayList<>();
        alist2.add(3);
        alist2.add(4);
        alist2.add(5);
        System.out.println("Before adding all elements of ArrayList1 to ArrayList2 : " + alist2);

        alist2.addAll(alist);
        System.out.println("After adding all elements of ArrayList1 to ArrayList2 :" + alist2);

        //find element at particular index
        System.out.println("Index of 2 -> Element : "+alist2.indexOf(2));

        alist2.add(5);
        alist2.add(6);

        System.out.println(alist2);
        //it returns the index of the last occurrence of the element
        System.out.println("Last occurrence of the element : "+alist2.lastIndexOf(5));

        //sublist
        List <Integer> alist3 = alist2.subList(1,4);
        System.out.println(alist3);
        alist3.set(0,100);
        System.out.println("alist3 -> "+alist3);
        System.out.println("alist2 -> "+alist2);//shallow copy it changed in alist2 as well
    }
}

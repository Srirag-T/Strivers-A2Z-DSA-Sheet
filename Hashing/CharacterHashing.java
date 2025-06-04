package Hashing;
import java.util.*;
public class CharacterHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] hash = new int[26];
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
         hash[str.charAt(i)-'a'] +=1;
        }
        int t = sc.nextInt();
        while(t!=0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch - 'a']);
            t--;
        }

    }
}

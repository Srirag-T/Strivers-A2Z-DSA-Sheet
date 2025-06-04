package Hashing;
import java.util.*;
public class CharacterHashing {
    public static void main(String[] args){
        String str = "abcdabefc";
        int[] hash = new int[25];
        for(int i=0;i<str.length();i++){
         int chNum = (int) str.charAt(i);
         hash[chNum-i] +=1;

        }
    }
}

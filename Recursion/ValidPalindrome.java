package Recursion;

import javax.swing.text.html.StyleSheet;

public class ValidPalindrome {
    public static String ReverseString(String s){
        return ReverseHelper(s,s.length()-1);
    }
    private static String ReverseHelper(String s, int index){
        if(index<0)
            return "";

        return s.charAt(index)+ReverseHelper(s,index-1);
    }
    public static boolean isPalindrome(String s) {
        String cleaned = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }

        return cleaned.equals(ReverseString(cleaned));
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        if(isPalindrome(s)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

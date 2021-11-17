/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA
This exercise will verify that your are able to solve the character of the string or compare freqauencies of characters.
Sample Input 1:

anagram 
margana
Sample Output 1:
Anagram
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String A, String B) {
        // Complete the function
        A=A.toLowerCase();
        B=B.toLowerCase();
        boolean f=false;
        char[]c=A.toCharArray();
        Arrays.sort(c);
        char[]d=B.toCharArray();
        Arrays.sort(d);
        String a= new String (c);
        String b=new String(d);
        if(a.equals(b)){
            f=true;
            
        }
        return f;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B= scan.next();
        scan.close();
        boolean ret = isAnagram(A, B);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

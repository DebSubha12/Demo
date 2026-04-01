package String;

import java.util.Scanner;

public class CheckAlmostEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Count frequencies for word1
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        
        // Count frequencies for word2
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }
        
        // Compare frequencies
        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > 3) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string word1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter string word2: ");
        String word2 = sc.nextLine();

       CheckAlmostEquivalent obj = new CheckAlmostEquivalent();

        boolean result = obj.checkAlmostEquivalent( word1,  word2) ;// ✅ correct type

        System.out.println("Are the strings almost equivalent?  " + result);

        sc.close();
    }
}

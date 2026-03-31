package String;

import java.util.Scanner;

public class FindAddedLetter {
   
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (char c : t.toCharArray()) {
            sum += c;
        }

        for (char c : s.toCharArray()) {
            sum -= c;
        }

        return (char) sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        FindAddedLetter obj = new FindAddedLetter();

        char result = obj.findTheDifference(s, t); // ✅ correct type

        System.out.println("The added character is: " + result);

        sc.close();
    }
}
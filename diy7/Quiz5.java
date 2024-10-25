package diy7;
import java.util.Scanner;
public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabet[index]) { 
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        String result = (count == 26)? "Pangram" : "Not Pangram";
        System.out.println(result);

        sc.close();
    }
}

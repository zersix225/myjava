# #Question 5
A pangram is a string that contains every letter of the English alphabet at least once. Your task is to determine whether a given sentence is a pangram. Ignore case sensitivity. Return "pangram" if the sentence is a pangram and "not pangram" otherwise.

## Input:
* A single line containing the input string 𝑠. Each character of the string 𝑠 will be an ASCII character.


## Output:
* Return the string "pangram" if the input string is a pangram; otherwise, return "not pangram". 

## For Example:

| Input  | Result |
|--------|--------|
| The quick brown fox jumps over the lazy dog | Pangra      |
| This is not a pangram.                      | Not Pangram | 


## Code

```bash
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
        System.out.println((count == 26? "Pangram" : "Not Pangram"));

        sc.close();
    }
}
```
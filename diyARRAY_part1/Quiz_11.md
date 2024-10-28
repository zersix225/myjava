# #Question 11
Given two strings s and t, return true if s is a subsequence of t, or false otherwise. A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

## Input:
* Shorter string s
* Longer string t


## Output:
* True if s is a subsequence of t, false otherwise

## Code

```bash
import java.util.Scanner;
public class Quiz11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s  =  sc.nextLine();
        String t = sc.nextLine();

        int i = 0;  
        int j = 0; 
        
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  
            }
            j++;  
        }

       
        if (i == s.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
```
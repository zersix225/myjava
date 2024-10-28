# #Question 13
Implement a method to perform basic string compression using the counts of repeated characters. If the compressed string is not smaller than the original string, return the original string.

## Input:
* A random string


## Output:
* The compressed string or the original string is printed based on the length comparison

## Code

```bash
import java.util.Scanner;
public class Quiz13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        
        boolean[] skipChar = new boolean[ch.length];
        String output = "";

        for (int i = 0; i < ch.length; i++) {
            if (skipChar[i]){
                continue;
            } 

            int count = 1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j]){
                    skipChar[j] = true;
                    count++;
                }else{
                    break;
                }
            }
            output += ch[i]+""+count;
        }
        
        System.out.println(output.length() < str.length() ? output : str);
        sc.close();
    }
}
```
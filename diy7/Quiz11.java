package diy7;
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

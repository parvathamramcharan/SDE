// A Pangram is string/sentence which contains atleast all alphabets once;
package DS;

import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        boolean[] letters = new boolean[26];
        int count = 0;
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    count++;
                }
            }
        }
        if (count == 26) {
            System.out.println("The Sentence is a pangram");
        } else {
            System.out.println("The sentence is not a pangram");
        }

    }
}

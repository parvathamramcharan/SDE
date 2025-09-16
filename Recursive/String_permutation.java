import java.util.*;

public class String_permutation {

    // Recursive function to generate permutations
    public static void permute(String str, String ans) {
        // Base case: if string is empty, print the current answer
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Try every character at the first position
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remaining string after removing the chosen char
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recurse with reduced string
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read string from user

        System.out.println("Permutations of " + input + ":");
        permute(input, "");
    }
}

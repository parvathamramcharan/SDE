
// Count Maximum Consecutive One's in the array
// Input: prices = {1, 1, 0, 1, 1, 1}
// Output: 3
// Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
import java.util.*;

public class maxConseOnes {
    public static int answer(int[] arr) {
        int n = arr.length;
        int max = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                curr++;
            } else if (arr[i] == 0) {
                curr = 0;
                max = Math.max(max, curr);
            }

        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr));
    }
}

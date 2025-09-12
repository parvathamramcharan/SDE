
// Find the missing number in an array
//  N = 5, array[] = {1,2,4,5}
// Result:
//  3
import java.util.*;

public class MissingNumber {
    public static int missing(int[] arr, int n) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = sum ^ arr[i];
            total = total ^ (i + 1);
        }
        total = total ^ n;
        return total ^ sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missing(arr, n));
    }
}

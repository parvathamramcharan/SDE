
// Rotate array by K elements right
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position 
import java.util.*;

public class RotateK_Left {
    public static int[] right_k_rotate(int[] arr, int k) {
        int n = arr.length;
        int t = n - k;
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = t; i < n; i++) {
            ar.add(arr[i]);
        }
        for (int i = 0; i < t; i++) {
            ar.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ar.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = right_k_rotate(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

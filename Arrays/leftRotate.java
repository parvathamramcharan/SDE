
//Left Rotate the Array by One
//1 2 3 4 5
// 2 3 4 5 1 
import java.util.*;

public class leftRotate {
    public static void leftR(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leftR(arr);
        System.out.println(Arrays.toString(arr));
    }
}

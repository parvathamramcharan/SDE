
//check of array is sorted or not
//{1,2,3,4,5}
//{4,6,3,8,2}
import java.util.*;

public class ArraySortedOrNot {
    public static boolean IsSorted(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (IsSorted(arr)) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}

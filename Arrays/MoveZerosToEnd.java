
// Move all Zeros to the end of the array
// Input:
//  1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output:
//  1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
import java.util.*;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ar.add(arr[i]);
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            arr[i] = ar.get(i);
        }

        for (int i = ar.size(); i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}

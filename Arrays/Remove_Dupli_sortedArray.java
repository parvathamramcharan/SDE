
//Remove Duplicates in-place from Sorted Array
//Input:
//  arr[1,1,2,2,2,3,3]
// Output:
//  arr[1,2,3,_,_,_,_]
import java.util.*;

public class Remove_Dupli_sortedArray {
    public static int remove(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        int i = 0;
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            arr[i++] = it.next();
        }
        return hs.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = remove(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

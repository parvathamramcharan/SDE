
// Union of Two Sorted Arrays
// n = 5,m = 5.
// arr1[] = {1,2,3,4,5}  
// arr2[] = {2,3,4,4,5}
// Output:
//  {1,2,3,4,5}
import java.util.*;

public class UnionTwoSortArrays {
    public static int[] res(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            hs.add(arr2[i]);
        }
        int[] arr3 = new int[hs.size()];
        int j = 0;
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            arr3[j++] = it.next();
        }
        return arr3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ans = res(arr1, arr2);
        System.out.println(Arrays.toString(ans));

    }
}

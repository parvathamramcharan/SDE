
//count of sum of two numbers in array equal to other number in array
//n = 4
//arr = 1,5,3,2
//output : 2 ==> 1 + 2 =3 , 3 + 2 = 5
import java.util.*;

public class count_triplets {
    public static int triplets(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int curr = arr[start] + arr[end];
                if (curr == arr[i]) {
                    count++;
                    start++;
                    end--;
                } else if (curr < arr[i]) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = triplets(arr);
        System.out.println(result);
    }
}

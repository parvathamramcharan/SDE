
// array contains 0 1 2 sort them in ascending order
//arr =>  0 ,2, 1 ,2 ,0
//ouptut => 0,0,1,2,2
import java.util.*;

public class Sort_of_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = 0, ones = 0;
        for (int i : arr) {
            switch (i) {
                case 0:
                    arr[index++] = 0;
                    break;
                case 1:
                    ones++;
                    break;
            }
        }
        n = n - index;
        while (n-- > 0) {
            if (ones-- > 0) {
                arr[index++] = 1;
            } else {
                arr[index++] = 2;
            }
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

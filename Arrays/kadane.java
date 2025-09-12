
//kadane algorithim 
//continous maximum sub array sum
// 5
//  3 -2 4 8 -4 2
// 13
import java.util.*;

public class kadane {
    public static int maxKadane(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = maxKadane(nums);
        System.out.println(res);
    }
}

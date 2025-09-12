
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
import java.util.*;

public class MaxSubArray {
    public static int res(int[] nums) {
        int n = nums.length;
        int sum = 0;   
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (sum + nums[i] > 0) {
                sum = sum + nums[i];
            } else {
                sum = 0;
            }
            if (maxsum < sum) {
                maxsum = sum;
            }
        }
        int max = Integer.MIN_VALUE;
        if (maxsum == 0) {
            for (int i = 0; i < n; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            maxsum = sum;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = res(nums);
        System.out.println(ans);

    }
}

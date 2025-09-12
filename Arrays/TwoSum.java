
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.*;

public class TwoSum {
    public static int[] result(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int compliment = target - nums[i];
            if (hp.containsKey(compliment)) {
                return new int[] { hp.get(compliment), i };
            }
            hp.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = result(nums, target);
        System.out.println(Arrays.toString(ans));

    }
}

import java.util.ArrayList;
import java.util.List;

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int targetSum = 7;
        List<List<Integer>> result = findSubarrays(nums, targetSum);
        System.out.println("Subarrays with sum " + targetSum + ":");
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }

    public static List<List<Integer>> findSubarrays(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == targetSum) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int i = start; i <= end; i++) {
                        subarray.add(nums[i]);
                    }
                    result.add(subarray);
                }
            }
        }

        return result;
    }
}
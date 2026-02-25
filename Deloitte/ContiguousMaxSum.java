public class ContiguousMaxSum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10 , 2, 3, 1};
        int k = 3;
        System.out.println(contiguousSum(nums, k));
    }

    public static int contiguousSum(int nums[], int k) {
        int maxSum = 0;
        for(int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(sum, maxSum);
        }return maxSum;
    }
}

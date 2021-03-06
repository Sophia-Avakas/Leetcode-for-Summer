class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null) return 0;
        int res = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
            res = Math.max(res, sum);
        }
        return res;

    }
}
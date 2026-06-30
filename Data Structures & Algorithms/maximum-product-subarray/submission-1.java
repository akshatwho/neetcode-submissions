class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        System.out.println(max);

        int curMin = 1;
        int curMax = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                curMin = 1;
                curMax = 1;
                continue;
            }

            int temp = curMax * nums[i];

            curMax = Math.max(curMax * nums[i], curMin * nums[i]);
            curMax = Math.max(curMax, nums[i]);
            
            curMin = Math.min(temp, curMin * nums[i]);
            curMin = Math.min(curMin, nums[i]);

            max = Math.max(max, curMax);
        }

        return max;
    }
}

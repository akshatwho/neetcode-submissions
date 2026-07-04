class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] list = new int[nums.length];
        java.util.Arrays.fill(list, 1);

        int ans = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length;j++) {
                if (nums[i] < nums[j]) {
                    list[i] = Math.max(list[i], 1 + list[j]);
                }
            }

            ans = Math.max(ans, list[i]);

        }

        return ans;
        
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        int expSum = (nums.length * (nums.length + 1)) / 2;

        int actSum = 0;

        for (int i = 0; i<nums.length;i++) 
        {
            actSum = actSum + nums[i];
        }

        return expSum - actSum;
    }
}

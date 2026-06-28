class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int k = 1;

        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != nums[readIndex - 1]) {
                nums[k] = nums[readIndex];
                k++;
            }
        }

        return k;
    }
}
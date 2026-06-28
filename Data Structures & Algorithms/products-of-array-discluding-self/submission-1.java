class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        // int[] postfix = new int[nums.length];
        output[0] = 1;
        // postfix[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i -1];
        }

        // for (int j = nums.length - 2; j >= 0;j--) {
        //     postfix[j] = postfix[j + 1] * nums[j+1];
        // }

        // int[] output = new int[nums.length];
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * postfix;
            postfix = postfix * nums[i];
        }

        return output;
    }
}  

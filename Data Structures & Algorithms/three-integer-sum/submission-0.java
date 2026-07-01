class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                if (threeSum > 0) {
                    right = right - 1;
                } else if (threeSum < 0) {
                    left = left + 1;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left = left + 1;

                    while (nums[left] == nums[left - 1] && left < right) {
                        left = left + 1;
                    }
                }
            }
        }

        return res;
    }
}

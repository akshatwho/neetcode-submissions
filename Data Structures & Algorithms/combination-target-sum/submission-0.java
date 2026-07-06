class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(nums, target, 0, 0, new ArrayList<>());
        return res;
    }

    public void dfs(int[] nums, int target, int i, int total, List<Integer> cur) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }

        if (i >= nums.length) {
            return;
        }

        if (total > target) {
            return;
        }

        cur.add(nums[i]);
        dfs(nums, target, i, total + nums[i], cur);

        cur.remove(cur.size() - 1);
        dfs(nums, target, i + 1, total, cur);

    }
}

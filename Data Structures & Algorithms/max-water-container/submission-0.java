class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left); 
            res = Math.max(area, res);

            if (heights[left] < heights[right]) {
                left = left + 1;
            } else if (heights[left] > heights[right]) {
                right = right - 1;
            } else {
                if (heights[left + 1] > heights[right - 1]) {
                    left = left + 1;
                } else {
                    right = right - 1;
                }
            }
        }

        return res;
    }
}

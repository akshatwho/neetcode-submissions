class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums: number[]): number {
        const numsSet = new Set(nums);
        let longestCons = 0;

        for (const num of nums) {
            if (!numsSet.has(num - 1)) {
                let current = num
                let length = 1
                while (numsSet.has(current + 1)) {
                    current++;
                    length++
                }
                longestCons = Math.max(longestCons, length)
            }

        }
        return longestCons
    }
}

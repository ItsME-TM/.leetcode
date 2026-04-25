/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    int memory[] = new int[46]; // Since n is at most 45
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (memory[n] != 0) return memory[n];
        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        memory[n] = ways;
        return ways;
    }
}
// @lc code=end


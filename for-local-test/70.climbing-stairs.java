
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        int result = solution.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}



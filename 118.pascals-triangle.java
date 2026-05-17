/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> cRow = new ArrayList<>();
            // First 1
            cRow.add(1);
            for(int j = 1; j <= i - 2; j++){
                cRow.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
            }
            // Last 1
            if(i > 1) cRow.add(1);
            result.add(cRow);
        }
        return result;
    }
}
// @lc code=end


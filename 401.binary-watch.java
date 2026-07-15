/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            for(int m = 0; m < 60; m++){
                if (Integer.bitCount(i) + Integer.bitCount(m) == turnedOn){
                    String time = String.format("%d:%02d", i, m);
                    result.add(time);
                }
            }
        }
        return result;
    }
}
// @lc code=end


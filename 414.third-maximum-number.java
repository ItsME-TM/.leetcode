/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        if(list.size() < 3){
            return Collections.max(list);
        }
        Collections.sort(list);
        return list.get(list.size() - 3);
    }
}
// @lc code=end


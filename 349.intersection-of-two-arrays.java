/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.remove(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
// @lc code=end


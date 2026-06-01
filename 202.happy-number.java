/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        Set<Integer> tracker = new HashSet<>();
        while(n != 1){
            if (tracker.contains(n)) return false;
            tracker.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
// @lc code=end


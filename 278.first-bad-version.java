/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lowLimit = 1;
        int highLimit = n;
        while(lowLimit < highLimit){
            int mid = lowLimit + (highLimit - lowLimit) / 2;
            if(isBadVersion(mid)) {
                highLimit = mid;
            } else {
                lowLimit = mid + 1;
            }
        }
        return lowLimit;
    }
}
// @lc code=end


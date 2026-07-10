/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lower = 1;
        int upper = n;
        while (lower <= upper){
            int mid = lower + (upper - lower) / 2;
            int guessResult = guess(mid);
            if (guessResult == 0) return mid;
            else if (guessResult < 0) upper = mid - 1;
            else lower = mid + 1;
        }
        return -1;
    }
}
// @lc code=end


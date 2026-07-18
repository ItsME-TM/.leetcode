
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int result = 0;
        boolean hasOdd = false;
        for (int c : count){
            if (c % 2 == 0) {
                result += c / 2;
            } else{
                result += c / 2;
                hasOdd = true;
            }
        }
        return result * 2 + (hasOdd ? 1 : 0);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "abccccdd";
        int longestPalindromeLength = solution.longestPalindrome(input);
        System.out.println("Longest Palindrome Length: " + longestPalindromeLength);
    }
}



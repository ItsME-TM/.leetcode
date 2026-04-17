
class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        int result = solution.strStr(haystack, needle);
        System.out.println(result); // Output: 2
    }
}



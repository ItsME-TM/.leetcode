
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length(); j++){
            if(i < s.length() && s.charAt(i) == t.charAt(j)){
                i++;
            }
        }
        return i == s.length();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result);
    }
}



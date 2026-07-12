class Solution {
    public int firstUniqChar(String s) {
        int occurrences[] = new int[26];
        for (char c : s.toCharArray()){
            occurrences[c - 'a']++;
        }
        for (char c : s.toCharArray()){
            if(occurrences[c - 'a'] == 1) return s.indexOf(c);
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "leetcode";
        int result = solution.firstUniqChar(s);
        System.out.println("The index of the first unique character in \"" + s + "\" is: " + result);
    }
}



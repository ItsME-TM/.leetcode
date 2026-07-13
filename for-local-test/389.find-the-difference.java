
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (char c : t.toCharArray()) {
            sum += c;
        }
        for (char c : s.toCharArray()) {
            sum -= c;
        }
        return (char) sum;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.findTheDifference("abcd", "abcde")); // Output: 'e'
    }
}



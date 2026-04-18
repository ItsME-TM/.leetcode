
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;
        int lastIndex = s.length() - 1;
        while(lastIndex >= 0 && s.charAt(lastIndex) == ' '){
            lastIndex--;
        }
        int lastWordLength = 0;
        while(lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
            lastIndex--;
            lastWordLength++;
        }
        return lastWordLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
    }
}



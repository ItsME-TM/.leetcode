
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int lastIndex = str.length() - 1;
        int firstIndex = 0;
        while (firstIndex < lastIndex){
            if(str.charAt(firstIndex) != str.charAt(lastIndex)) return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
    
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
    }
}



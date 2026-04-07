/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        //conver to char array
        char[] chars = s.toCharArray();
        //create a stack to store the left parentheses
        ArrayList<Character> stack = new ArrayList<>();
        for (char c : chars){
            if(c == '(' || c == '[' || c == '{'){
                stack.add(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.remove(stack.size() - 1);
                if(c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end


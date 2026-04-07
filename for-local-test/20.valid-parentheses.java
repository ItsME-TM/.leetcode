import java.util.ArrayList;

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()[]{}";
        System.out.println(solution.isValid(s));
    }
}


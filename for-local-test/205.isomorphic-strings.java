import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sINt = new HashMap<>();
        Map<Character, Character> tINs = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sINt.containsKey(sChar) && sINt.get(sChar) != tChar) return false;
            if(tINs.containsKey(tChar) && tINs.get(tChar) != sChar) return false;
            sINt.putIfAbsent(sChar, tChar);
            tINs.putIfAbsent(tChar, sChar);
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add")); // true
        System.out.println(solution.isIsomorphic("foo", "bar")); // false
        System.out.println(solution.isIsomorphic("paper", "title")); // true
    }
}


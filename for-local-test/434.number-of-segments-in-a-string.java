
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;
                while (i < s.length() && s.charAt(i) == ' '){
                    i++;
                }
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello, my name is John";
        int result = solution.countSegments(s);
        System.out.println("Number of segments: " + result); // Output: Number of segments: 5
    }
}



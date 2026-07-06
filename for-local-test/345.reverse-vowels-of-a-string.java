class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            while(left < right && !isVowel(chars[left])){
                left++;
            }
            while(left < right && !isVowel(chars[right])){
                right--;
            }
            if(left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "hello";
        String output = solution.reverseVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

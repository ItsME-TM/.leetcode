class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) return;
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] str1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(str1);
        System.out.println(str1); // Output: "olleh"

        char[] str2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(str2);
        System.out.println(str2); // Output: "hannaH"
    }
}




class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] output = new int[digits.length + 1];
        output[0] = 1;
        return output;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] digits = {1, 2, 3};
        int[] output = s.plusOne(digits);
        for(int i : output){
            System.out.print(i + " ");
        }
    }
}



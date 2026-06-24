// DigitROOT: 
// Any number and the sum of its digits have the same remainder when divided by 9
class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        if(num % 9 == 0) return 9;
        return num % 9;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 38;
        int result = solution.addDigits(num);
        System.out.println("The result of addDigits(" + num + ") is: " + result);
    }
}



class Solution {
    public String addStrings(String num1, String num2) {
        if(num1 == null || num2 == null) return null;
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if (i >= 0){
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String num1 = "123";
        String num2 = "456";
        String result = solution.addStrings(num1, num2);
        System.out.println("Result: " + result); // Output: Result: 579
    }
}



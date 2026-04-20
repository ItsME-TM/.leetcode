
class Solution {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;
        int carryOver = 0;
        int sum = 0;
        while (aPointer >= 0 || bPointer >= 0 || carryOver > 0){
            sum = carryOver;
            if (aPointer >= 0){
                sum = sum + a.charAt(aPointer) - '0';
                aPointer--;
            }
            if (bPointer >= 0){
                sum = sum + b.charAt(bPointer) - '0';
                bPointer--;
            }
            sb.append(sum % 2);
            carryOver = sum / 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String a = "11";
        String b = "1";
        String result = solution.addBinary(a, b);
        System.out.println(result);
    }
}



class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // XOR operation is used
            // XOR works in binary form, and it has the following properties:
            // 1. a ^ a = 0 (XOR of a number with itself is 0)
            // 2. a ^ 0 = a (XOR of a number with 0 is the number itself)
            // 3. XOR is commutative and associative, meaning the order of operations does not matter
            // ┌─────────┬────────────────┐
            // │ Decimal │ Binary (5‑bit) │
            // ├─────────┼────────────────┤
            // │ 4       │ 00100          │
            // ├─────────┼────────────────┤
            // │ 1       │ 00001          │
            // ├─────────┼────────────────┤
            // │ 2       │ 00010          │
            // ├─────────┼────────────────┤
            // │ 1       │ 00001          │
            // ├─────────┼────────────────┤
            // │ 2       │ 00010          │
            // └─────────┴────────────────┘
            // XOR step‑by‑step:
            // 1. 00000 ^ 00100 = 00100  (4)
            // 2. 00100 ^ 00001 = 00101  (5)
            // 3. 00101 ^ 00010 = 00111  (7)
            // 4. 00111 ^ 00001 = 00110  (6)
            // 5. 00110 ^ 00010 = 00100  (4) ← final result
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums)); // Output: 4
    }
}

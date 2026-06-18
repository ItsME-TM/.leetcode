
class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 43261596;
        int res = solution.reverseBits(n);
        System.out.println(res);
    }
}


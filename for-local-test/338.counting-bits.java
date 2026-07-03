class Solution {
    public static int[] countBits(int n) {
        int [] res = new int[n + 1];
        for (int i = 1; i <= n; i++){
            res[i] = res[i & (i - 1)] + 1;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 5;
        int[] result = countBits(n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}



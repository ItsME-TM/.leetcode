
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count++;
            n &= (n - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 11; // Example input
        int result = solution.hammingWeight(n);
        System.out.println("Number of 1 bits in " + n + " is: " + result);
    }
}



class Solution{
    private int n;

    Solution(int n) {
        this.n = n;
    }

    public boolean isBadVersion(int version) {
        return version >= n;
    }

    public int firstBadVersion(int n) {
        int lowLimit = 1;
        int highLimit = n;
        while(lowLimit < highLimit){
            int mid = lowLimit + (highLimit - lowLimit) / 2;
            if(isBadVersion(mid)) {
                highLimit = mid;
            } else {
                lowLimit = mid + 1;
            }
        }
        return lowLimit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution(10);
        int firstBadVersion = solution.firstBadVersion(20);
        System.out.println(firstBadVersion);
    }
}



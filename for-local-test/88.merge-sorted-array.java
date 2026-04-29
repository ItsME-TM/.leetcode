
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int mp = m + n - 1;

        while (p1 >= 0 && p2 >= 0){
            if (nums1[p1] > nums2[p2]){
                nums1[mp] = nums1[p1];
                mp--;
                p1--;
            }else{
                nums1[mp] = nums2[p2];
                p2--;
                mp--;
            }
        }

        while(p2 >= 0){
            nums1[mp] = nums2[p2];
            p2--;
            mp--;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        s.merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}



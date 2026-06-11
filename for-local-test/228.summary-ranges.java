import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<String> answer = new ArrayList<>();
        int n = nums.length;
        int start = nums[0];
        for (int i = 0; i < n; i++){
            if(i == n - 1 || nums[i + 1] != nums[i] + 1){
                if (start == nums[i]){
                    answer.add(String.valueOf(start));
                } else {
                    answer.add(start + "->" + nums[i]);
                }
                if (i != n - 1){
                    start = nums[i + 1];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,4,5,7};
        System.out.println(solution.summaryRanges(nums));
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        if(list.size() < 3){
            return Collections.max(list);
        }
        Collections.sort(list);
        return list.get(list.size() - 3);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1};
        int result = solution.thirdMax(nums);
        System.out.println(result); // Output: 1
    }
}



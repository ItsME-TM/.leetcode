import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.remove(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [2]
    }
}

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> cRow = new ArrayList<>();
            // First 1
            cRow.add(1);
            // Middle numbers
            for(int j = 1; j <= i - 2; j++){
                cRow.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
            }
            // Last 1
            if(i > 1) cRow.add(1);
            result.add(cRow);
        }
        return result;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}



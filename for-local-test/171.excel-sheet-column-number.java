
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()){
            if (c < 'A' || c > 'Z') return -1;
            result =  result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        String columnTitle = "AB";
        System.out.println(sol.titleToNumber(columnTitle));
    }
}



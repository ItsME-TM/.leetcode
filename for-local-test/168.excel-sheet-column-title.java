class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            sb.append((char)('A' + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int columnNumber = 22;
        String title = solution.convertToTitle(columnNumber);
        System.out.println("Column number: " + columnNumber + ", Column title: " + title);
    }
}



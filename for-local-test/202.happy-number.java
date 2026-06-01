import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        Set<Integer> tracker = new HashSet<>();
        while(n != 1){
            if (tracker.contains(n)) return false;
            tracker.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.isHappy(19));
        System.out.println(sol.isHappy(21));
    }
}


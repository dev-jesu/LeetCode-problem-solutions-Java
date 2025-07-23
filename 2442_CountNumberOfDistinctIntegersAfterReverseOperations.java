
// Time Complexity: O(n * d), where d is the number of digits per number
// Space Complexity: O(n) for the HashSet

import java.util.*;

class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();
    }

    public int reverse(int num) {
        int a = 0;
        while (num != 0) {
            int rem = num % 10;
            a = a * 10 + rem;
            num /= 10;
        }
        return a;
    }
}

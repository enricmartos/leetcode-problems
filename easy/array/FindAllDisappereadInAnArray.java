// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

// Find all the elements of [1, n] inclusive that do not appear in this array.

// Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dissapearedNumbers = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i: nums) {
            if (!set.contains(i)) {
                set.add(i);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i+1)) {
                dissapearedNumbers.add(i+1);
            }
        }
        return dissapearedNumbers;
        
    }
}

// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.



/*
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums) {
            set.add(i);
        }
        
        for(int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        //The set contains all the numbers between 0 and n
        return -1;
        
    }
}
*/ 

// Optimum solution following Gauss law
class Solution {
    public int missingNumber(int [] nums) {
        int sum = 0;
        for(int i: nums) {
            sum += i;
        }
        
        int n = nums.length + 1;
        return (n * (n - 1) / 2) - sum;
    }
    
}

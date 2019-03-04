// Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.


class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Sort the array in a descending order
        Arrays.sort(nums);
        return nums[nums.length - k];
        
    }
}

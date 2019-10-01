// 1207. Unique Number of Occurrences
// Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            }
            else {
                map.put(i, map.get(i) + 1);
            }
        }
        Set<Integer> valuesSet = new HashSet<>(map.values());
        
        return valuesSet.size() == map.size();
    }
    
    //Alternative solution
    // public boolean uniqueOccurrences(int[] arr) {
    //     Map<Integer, Integer> count = new HashMap<>();
    //     for (int a : arr)
    //         count.put(a, 1 + count.getOrDefault(a, 0));
    //     return count.size() == new HashSet<>(count.values()).size();
    // }
}

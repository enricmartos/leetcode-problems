// 961. N-Repeated Element in Size 2N Array
// In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

// Return the element repeated N times.


class Solution {
    public int repeatedNTimes(int[] A) {
        //hashMap id(Integer) => numberOfAppereances(Integer)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //N: there is an element repetaed N times
        int N = A.length / 2;
        for (int i : A) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                int counter = map.get(i) + 1;
                if (counter == N) {
                    return i;
                }
                else {
                   map.put(i, counter); 
                }
            }
        }
        return -1;
    }
}

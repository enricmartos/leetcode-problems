// Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.



class Solution {
    public int[] sortedSquares(int[] A) {
        int[] sortedSquares = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            sortedSquares[i] = A[i]*A[i];
            System.out.println("sortedSquares: " + sortedSquares[i]);
        } 
        Arrays.sort(sortedSquares);
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(sortedSquares));
        return sortedSquares;
    }
}

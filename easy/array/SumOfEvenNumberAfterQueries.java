// We have an array A of integers, and an array queries of queries.

// For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  Then, the answer to the i-th query is the sum of the even values of A.

// (Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)

// Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] evenSum = new int[A.length];
        int valQuery = 0;
        int indexQuery = 0;
        int sum = 0;
        
        for (int i = 0; i < queries.length; i++) {
            valQuery = queries[i][0];
            indexQuery = queries[i][1];
            for (int j = 0; j < A.length; j++) {
                if (j == indexQuery) {
                    A[j] += valQuery;
                }
                if (A[j] % 2 == 0) {
                    sum += A[j];
                }
            }
            evenSum[i] = sum;
            sum = 0;
        }
        return evenSum;
        
    }
}

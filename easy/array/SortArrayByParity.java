// Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

// You may return any answer array that satisfies this condition.

class Solution {
    
    public static int[] convertListToArray(List<Integer> evenAndOdd) {
        int[] evenAndOddArray = new int[evenAndOdd.size()];
        for (int i=0; i < evenAndOddArray.length; i++) {
            evenAndOddArray[i] = evenAndOdd.get(i).intValue();
        }
        return evenAndOddArray;
    }
    
    public int[] sortArrayByParity(int[] A) {
        Arrays.sort(A);
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        
        for (int num: A) {
            if (num % 2 == 0) {
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }
        
        even.addAll(odd);
        
        return convertListToArray(even);
    }
}

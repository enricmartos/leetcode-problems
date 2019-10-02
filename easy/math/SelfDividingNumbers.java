// Self Dividing Numbers

// A self-dividing number is a number that is divisible by every digit it contains.

// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

// Also, a self-dividing number is not allowed to contain the digit zero.

// Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

class Solution {
    
    public boolean isSelfDividing(int i) {
        if (i != 0) {
            for (int n = i; n > 0; n /= 10) {
                if (n % 10 == 0 || i %  (n % 10) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }
}

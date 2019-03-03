// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

// If the last word does not exist, return 0.

// Note: A word is defined as a character sequence consists of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
        
        
        s = s.trim();
        int length = s.length();
        
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                return length - i - 1;
        }
        
        return length;
    }
}

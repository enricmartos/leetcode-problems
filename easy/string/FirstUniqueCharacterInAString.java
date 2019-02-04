// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.



class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(!map.containsKey(current)) {
                map.put(current, i);
            }
            else {
                //Invalid current char because it is a repeated one
                map.put(current, -1);
            }
        }
        
        //What is the smallest index that a character it is mapped to?
        int min = Integer.MAX_VALUE;
        for(char c: map.keySet()) {
            //Valid value & the minimum one
            if(map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }
        
        //If there is no unique char-> return -1
        return min == Integer.MAX_VALUE? -1 : min;
        
    }
}

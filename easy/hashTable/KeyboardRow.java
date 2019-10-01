// 500. Keyboard Row
// Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

class Solution {
    
    public int rowNumber(char c) {
        String row1 = "qQwWeErRtTyYuUiIoOpP";
        String row2 = "aAsSdDfFgGhHjJkKlL";
        String row3 = "zZxXcCvVbBnNmM";
        
        if (row1.indexOf(c) != -1) {
            return 1;
        } else if (row2.indexOf(c) != -1) {
            return 2;
        } else {
            return 3;
        }      
    }
    
    public String[] findWords(String[] words) {
        
        List<String> resultWords = new ArrayList<>();
        
        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                Character currentChar = word.charAt(i);
                if (!map.containsKey(currentChar)) {
                    map.put(currentChar, rowNumber(currentChar));
                }
            }
            Set<Integer> set = new HashSet<>(map.values());
            if (set.size() == 1) {
                resultWords.add(word);
            }
        }
        
        String[] resultArr = new String[resultWords.size()];
        resultWords.toArray(resultArr);
        
        return resultArr;
        
    }
}

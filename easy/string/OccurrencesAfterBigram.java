// 1078. Occurrences After Bigram

// Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

// For each such occurrence, add "third" to the answer, and return the answer.



class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<String>();
        String[] splittedText = text.split(" ");
        int arrLength = splittedText.length;
        for (int i = 0; i < arrLength - 1; i++) {
            // System.out.println("i: " + i + ", splittedText: " + splittedText[i]);
            if (splittedText[i].equals(first) && splittedText[i+1].equals(second) ) {
                System.out.println("i: " + i + ", splittedText: " + splittedText[i]);
                i = i + 2;
                if (i < arrLength) {
                    System.out.println("i: " + i + ", splittedText: " + splittedText[i]);
                    result.add(splittedText[i]);
                }
                i = i - 2;
            }
        }
        String[] resultArr = new String[result.size()];
        result.toArray(resultArr);
        return resultArr;
    }
}

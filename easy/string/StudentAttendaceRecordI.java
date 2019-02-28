// You are given a string representing an attendance record for a student. The record only contains the following three characters:
// 'A' : Absent.
// 'L' : Late.
// 'P' : Present.
// A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

// You need to return whether the student could be rewarded according to his attendance record.
    
class Solution {
    public boolean checkRecord(String s) {
       int aCtr = 0;
       boolean late = false;
        
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == 'A') {
              aCtr++; 
           }
       }

        if (s.contains("LLL")){
              late = true;  
        }
        
        if (aCtr > 1 || late) {
            return false;
        }
       
        return true;
    }
}

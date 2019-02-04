// There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

// The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

// Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

class Solution {
    public boolean judgeCircle(String moves) {
        //U complements D & R complements L
        int UD = 0;
        int LR = 0;
        for(int i = 0; i < moves.length(); i++) {
            char currentMove = moves.charAt(i); 
            if(currentMove == 'U') {
                UD++;
            } else if (currentMove == 'D') {
                UD--;
            } else if (currentMove == 'R') {
                LR++;
            } else if (currentMove == 'L') {
                LR--;
            }
        }
        
        return UD == 0 && LR == 0;
        
    }
}

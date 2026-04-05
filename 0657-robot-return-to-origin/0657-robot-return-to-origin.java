class Solution {
    public boolean judgeCircle(String moves) {
        int row = 0, col = 0;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            switch(move) {
                case 'R': 
                    col++;
                    break;
                case 'L': 
                    col--;
                    break;
                case 'U': 
                    row++;
                    break;
                case 'D': 
                    row--;
                    break;
            }
        }
        return row == 0 && col == 0;
    }
}
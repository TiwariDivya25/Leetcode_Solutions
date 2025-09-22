// Last updated: 22/09/2025, 08:58:44
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int r = 0; r < 9; r++) {
            rows[r] = new HashSet<Character>();
            columns[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') {
                    continue;
                }
                if(rows[r].contains(val)) 
                {
                    return false;
                }
                if(columns[c].contains(val)) 
                {
                    return false;
                }
                int idx = (r/3)*3 + c/3;
                if(boxes[idx].contains(val)) {
                    return false;
                }

                rows[r].add(val);
                columns[c].add(val);
                boxes[idx].add(val);
            }    
        }
        return true;
    }
}
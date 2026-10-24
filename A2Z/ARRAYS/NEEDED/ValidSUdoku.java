class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> columnSet = new HashSet<>();
        HashSet<Character> boxSet = new HashSet<>();

        for(int i = 0; i <= 8; i++){
            rowSet.clear();
            columnSet.clear();
            
            for(int j = 0; j <= 8; j++){

                if(board[i][j] != '.'){
                    if(rowSet.contains(board[i][j])){
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }

                if(board[j][i] != '.'){
                    if(columnSet.contains(board[j][i])){
                        return false;
                    }
                    columnSet.add(board[j][i]);
                }
            }
        }

        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                boxSet.clear();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char current = board[r + i][c + j];
                        if (current != '.') {
                            if (boxSet.contains(current)) {
                                return false;
                            }
                            boxSet.add(current);
                        }
                    }
                }
            }
        }

        return true;
    }
}
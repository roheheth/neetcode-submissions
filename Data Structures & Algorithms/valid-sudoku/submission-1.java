class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                char temp = board[i][j];
                if(temp == '.'){
                    continue;
                }
                if(!set.add(temp+"in row"+i)||
                   !set.add(temp+"in col"+j)||
                   !set.add(temp+"in box"+(i/3)+(j/3))
                ){
                    return false;
                }
            }
        }
        return true;
    }
}

class Solution {
    int max = 0;
    int c = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == 1){
                    c = 0;           
                    dfs(grid, i, j, row, col);
                    max = Math.max(max, c);
                }
            }
        }
        return max;
    }

    public void dfs(int[][] grid, int i, int j, int row, int col){
        if(i < 0 || i>= row || j<0 || j>=col || grid[i][j] != 1)return;

        grid[i][j] = -1;
        c++;

        dfs(grid, i+1, j, row, col);
        dfs(grid, i-1, j, row, col);
        dfs(grid, i, j+1, row, col);
        dfs(grid, i, j-1, row, col);
    }
}

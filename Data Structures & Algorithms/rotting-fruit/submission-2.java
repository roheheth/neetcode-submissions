class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                    grid[i][j] = 0;
                }else if(grid[i][j] == 1){
                    grid[i][j] = 100;
                }else{
                    grid[i][j] = -1;
                }
            }
        }

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            for(int[] d : dir){
                int nr = row + d[0];
                int nc = col + d[1];
                if(nr<0 || nr >= r || nc<0 || nc>=c || grid[nr][nc]!=100){
                    continue;
                }
                grid[nr][nc] = grid[row][col]+1;
                q.offer(new int[]{nr,nc});
            }
        }
        int max = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j] == 100){
                    return -1;
                }else if(grid[i][j] > max){
                    max = grid[i][j];
                }
            }
        }
        return max;    
    }
}

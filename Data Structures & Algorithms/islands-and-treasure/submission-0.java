class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j] == 0){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cor = q.poll();
            for(int[] d : dir){
                int nr = cor[0]+d[0];
                int nc = cor[1]+d[1];
                if(nr<0 || nr>=r || nc<0 || nc>=c || grid[nr][nc] != Integer.MAX_VALUE){
                    continue;
                }
                grid[nr][nc] = grid[cor[0]][cor[1]]+1;
                q.offer(new int[]{nr,nc});
            }
        }
    }
}

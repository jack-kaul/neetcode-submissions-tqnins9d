class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++) {
            int prev = 0;
            for(int j=0; j < grid[i].length; j++) {
                if(grid[i][j] != prev) {
                    perimeter++;
                }
                prev = grid[i][j];
            }
            if(prev == 1) perimeter++;
        }

        for(int i = 0; i < grid[0].length; i++) {
            int prev = 0;
            for(int j=0; j < grid.length; j++) {
                if(grid[j][i] != prev) {
                    perimeter++;
                }
                prev = grid[j][i];
            }
            if(prev == 1) perimeter++;
        }
        return perimeter;
    }
}
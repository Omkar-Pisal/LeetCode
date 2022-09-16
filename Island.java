public class Island {
    void dfs(char[][] grid,int row, int col, boolean[][] visited){
        System.out.println("inside dfs");
            if (row<0||col<0||row>=grid.length||col>=grid[0].length||visited[row][col]||grid[row][col]=='0'){
                return;
            }
            visited[row][col]=true;
            dfs(grid,row,col-1,visited);
            dfs(grid,row-1,col,visited);
            dfs(grid,row,col+1,visited);
            dfs(grid,row+1,col,visited);
    }
    public int numOfIsland(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int noOfIsland = 0;
        for (int i=0;i< m;i++){
            for(int j=0;j<n;j++){
                if (!visited[i][j] && grid[i][j]=='1'){
                    System.out.println("Good!");
                    dfs(grid,i,j,visited);
                    noOfIsland++;
                }
            }
        }
        return noOfIsland;
    }

    public static void main(String[] args){
        Island island = new Island();
        char[][] grid = new char[4][4];
        grid[0][0]='1';
        grid[0][1]='1';
        grid[0][2]='0';
        grid[0][3]='0';
        grid[1][0]='1';
        grid[1][1]='0';
        grid[1][2]='0';
        grid[1][3]='0';
        grid[2][0]='0';
        grid[2][1]='0';
        grid[2][2]='1';
        grid[2][3]='0';
        grid[3][0]='0';
        grid[3][1]='0';
        grid[3][2]='0';
        grid[3][3]='1';

        int count = island.numOfIsland(grid);
        System.out.println(count);
    }
}

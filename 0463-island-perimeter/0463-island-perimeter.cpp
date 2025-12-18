class Solution {
public:
int peri=0;
void dfs(vector<vector<int>>&grid, int r, int c){
    if(r<0 || c<0 ||r>=grid.size() || c>=grid[0].size() || grid[r][c]==0){
        peri++;
        return ;
    }
    if(grid[r][c]==2)return;
    grid[r][c]=2;
    dfs(grid,r,c+1);
    dfs(grid,r+1,c);
    dfs(grid,r,c-1);
    dfs(grid,r-1,c);
}
     int islandPerimeter(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1){
             dfs(grid,i,j);
              return peri;

            }
        }
        }
        return 0;
    }
};

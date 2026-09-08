class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
    List<List<Integer>> copy= new ArrayList<>();
     
   int row =grid.length-1;
   int col=grid[0].length-1;

    for(int d=0;d<k;d++){
        int last=grid[row][col];
        for(int i=row;i>=0;i--){  
            for(int j=col;j>=0;j--){
                if(i==0 && j==0)break;

                if(j==0){
                    grid[i][j]=grid[i-1][col];}
              else{grid[i][j]=grid[i][j-1];}
            }
        }
      grid[0][0]=last;    }
    
    for (int i = 0; i < grid.length; i++) {
    List<Integer> curr = new ArrayList<>();
    for (int j = 0; j < grid[i].length; j++) {
        curr.add(grid[i][j]);
    }
    copy.add(curr);
}
    return copy;}
}
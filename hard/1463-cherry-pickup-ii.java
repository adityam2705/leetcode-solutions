class Solution {
    int[][][] dp;
    public int cherryPickup(int[][] grid) {
     
    dp=new int[grid.length][grid[0].length][grid[0].length];
   
   for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        Arrays.fill(dp[i][j],-1);}
        }

    return trav(0,0,0,grid[0].length-1,grid);
    }

    int trav(int i,int j,int a,int b,int[][] grid){

   if(i>=grid.length || j>=grid[0].length|| a>=grid.length || b>=grid[0].length || i<0 || a<0 || b<0 || j<0){return 0;}
     
    if(i==grid.length-1 && a==grid.length-1){

      if(j==b)return grid[a][b];

        return grid[i][j]+grid[a][b];}

     if(dp[i][j][b]!=-1)return dp[i][j][b];

    int fir11=trav(i+1,j-1,a+1,b-1,grid);
    int fir12=trav(i+1,j-1,a+1,b,grid);
    int fir13=trav(i+1,j-1,a+1,b+1,grid);

    int sec21=trav(i+1,j,a+1,b-1,grid);
    int sec22=trav(i+1,j,a+1,b,grid);
    int sec23=trav(i+1,j,a+1,b+1,grid);

    int thr31=trav(i+1,j+1,a+1,b-1,grid);
    int thr32=trav(i+1,j+1,a+1,b,grid);
    int thr33=trav(i+1,j+1,a+1,b+1,grid);
    
    int comp1=Math.max(fir11,Math.max(fir12,fir13));
    int comp2=Math.max(sec21,Math.max(sec22,sec23));
    int comp3=Math.max(thr31,Math.max(thr32,thr33));
     
if(i==a && j==b)return dp[i][j][b]=grid[a][b]+Math.max(comp1,Math.max(comp2,comp3));

    return dp[i][j][b]= grid[a][b]+grid[i][j]+Math.max(comp1,Math.max(comp2,comp3));
    }
}
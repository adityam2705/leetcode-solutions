

class Solution {
    int[][] dp;
    public int calculateMinimumHP(int[][] dungeon) {
    
    dp=new int[dungeon.length][dungeon[0].length];

    for(int i=0;i<dungeon.length;i++)
        Arrays.fill(dp[i],-1);

    return solve(0,0,dungeon);    
    }

  int solve(int i,int j,int[][] dungeon){

    if(i==dungeon.length-1 && j==dungeon[0].length-1){
       if(dungeon[i][j]<0)return Math.abs(dungeon[i][j])+1;
        return 1;}

    if(i>=dungeon.length || j>=dungeon[0].length){
        return (int)1e9;    }

    if(dp[i][j]!=-1)return dp[i][j];

    int right=solve(i+1,j,dungeon);

    int bottom=solve(i,j+1,dungeon);
    
    int curr=Math.min(right,bottom)-dungeon[i][j];

    return dp[i][j]=(curr>0)?curr:1;

    }
}
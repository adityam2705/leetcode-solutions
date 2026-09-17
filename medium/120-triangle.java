class Solution {
    int[][]dp;
    boolean[][] visited;
    public int minimumTotal(List<List<Integer>> triangle) {
    
    int m=triangle.size();
    int n=triangle.get(m-1).size();

    dp=new int[m][n];
   visited=new boolean[m][n];
   for(int i=0;i<m;i++)Arrays.fill(dp[i],-1);

    return solve(0,0,triangle); 
    }

    int solve(int i,int j,List<List<Integer>> triangle){

   if(j==triangle.size()-1)return triangle.get(j).get(i);

   if(visited[j][i])return dp[j][i];

    int left=solve(i,j+1,triangle);

    int right=solve(i+1,j+1,triangle);
        
        visited[j][i]=true;

    return dp[j][i]= triangle.get(j).get(i)+ Math.min(left,right);

    }
}
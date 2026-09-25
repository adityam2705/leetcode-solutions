class Solution {
    int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        
        int min=Integer.MAX_VALUE;
        
       dp=new int[matrix.length][matrix[0].length];
       
       for(int i=0;i<matrix.length;i++){
        Arrays.fill(dp[i],min);}

     for(int i=0;i<matrix[0].length;i++){
        int ans=trav(0,i,matrix);
        min=Math.min(ans,min);}

    return min;
    }

    int trav(int i,int j,int[][] matrix){

   if(i==matrix.length-1)return matrix[i][j];

    if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];

    int fir=Integer.MAX_VALUE;
    if(i<matrix.length-1 && j>0 ){
     fir=trav(i+1,j-1,matrix);}
     
    int sec=Integer.MAX_VALUE; 
    if(i<matrix.length-1){
     sec=trav(i+1,j,matrix);}

    int thi=Integer.MAX_VALUE;
    if(i<matrix.length-1 && j<matrix[0].length-1){   
     thi=trav(i+1,j+1,matrix);}

    return dp[i][j]=matrix[i][j]+Math.min(Math.min(fir,sec),thi);    }
}
class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
    
    int max=0;
    int n=img2.length;

   for(int a=0;a<n;a++){
   for(int b=0;b<n;b++){

   int count1 = 0;
   int count2 = 0; 
   int count3 = 0; 
   int count4 = 0;
    
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){

       int inew=i+a;
       int jnew=j+b;
       int inew1=i-a;
       int jnew1=j-b;

    if(inew<n && jnew<n && img2[i][j]==1 && img1[inew][jnew]==img2[i][j])count1++;

    if(inew1>=0 && jnew1>=0 && img2[i][j]==1 && img1[inew1][jnew1]==img2[i][j])count2++; 
    
    if(inew<n && jnew1>=0 && img2[i][j]==1 && img1[inew][jnew1]==img2[i][j])count3++; 
    
    if(inew1>=0 && jnew<n && img2[i][j]==1 && img1[inew1][jnew]==img2[i][j])count4++;
     
     }
   }
    max=Math.max(max, Math.max(Math.max(count1, count2),Math.max(count3, count4)));
      }
    }

   
    return max;
    }
}
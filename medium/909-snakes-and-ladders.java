class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;}
}
class Solution {
    int m;
    int n;
    public int snakesAndLadders(int[][] board) {

        m=board.length;
        n=board[0].length;
       boolean [][] visited = new boolean[m][n]; 
       Queue<Integer> q= new LinkedList<>();
       q.offer(1);
       visited[m-1][0]=true;
       int count=0;

     while(!q.isEmpty()){
    
        int size=q.size();

      for(int j=0;j<size;j++){  
       int x=q.poll();

       if(x==m*n) return count;
    
      for(int i=1;i<=6;i++){
        int xnew=x+i;
        
        if(xnew>m*n){continue;}
 
        Pair p=getcoord(xnew);

        int r=p.x;
        int c=p.y;
        
        if(visited[r][c]==true)continue;

        visited[r][c] = true;
        if(board[r][c]==-1){
           q.offer(xnew);}
        
        else{
          q.offer(board[r][c]); }  } }
          
          count++;}

          return -1;      
    }

    Pair getcoord(int xnew){

    int x=m-1-(xnew-1)/n;
    int y=(xnew-1)%n;
  
    if((m-1-x)%2==1){
       y=m-1-y; }
    

    return new Pair(x,y);
    }
}
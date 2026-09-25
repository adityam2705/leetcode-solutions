class Solution {
    Boolean[][] dp;
    Set<Integer> set = new HashSet<>();
    HashMap<Integer,Integer> map= new HashMap<>();

    public boolean canCross(int[] stones){
 
     for(int i=0;i<stones.length;i++){
        map.put(stones[i],i);
        set.add(stones[i]);}

     dp=new Boolean[stones.length][stones.length+1];

    return solve(0,stones,0);

    }

    boolean solve(int i,int [] stones,int k){
    
    if(i==stones.length-1){return true;}
     
    if(dp[i][k]!=null)return dp[i][k];

    boolean ans=false;
    
    for(int jump=k-1;jump<=k+1;jump++){
        if(jump<=0)continue;

        int next = stones[i] + jump;

        if(set.contains(next)){
            int nextIndex=map.get(next);

            if(solve(nextIndex,stones,jump)){
                    ans=true;
                    break;}  }  }    
     
     return dp[i][k]=ans;}
}
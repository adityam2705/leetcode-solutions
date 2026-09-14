class Solution {
    int[]balance;
    public int maximumRequests(int n, int[][] requests) {
     balance = new int[n];
     check(requests,0,0);
     return max; 
    }
    int max= 0;
    void check(int[][]requests , int idx,int count ){
        
         if(idx>=requests.length){
        if(allZero(balance)==true){
                max=Math.max(max,count);}
             return;}

        int from=requests[idx][0];
        int to=requests[idx][1];

              balance[from]--;
              balance[to]++;
              check(requests,idx+1,count+1);
              balance[from]++;
              balance[to]--;
              check(requests,idx+1,count);

    }
    boolean allZero(int[] arr){
    for(int x : arr){
        if(x != 0) return false;
    }
    return true;
}
}
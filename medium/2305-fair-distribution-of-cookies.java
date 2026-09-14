class Solution {
    public int distributeCookies(int[] cookies, int k) {
                int[] distrb= new int[k];
        backtrack(cookies,k,0,distrb);
        return min;
    }
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    void backtrack(int []cookies, int k,int j, int[] distrb){
        if(j>=cookies.length){
         int max = Arrays.stream(distrb).max().orElse(0);
         min =Math.min(max,min);
            return ;     }
       int cookie=cookies[j];
    for(int i=0;i<k;i++){
        distrb[i]+=cookie;
        backtrack(cookies,k,j+1,distrb);
        distrb[i]-=cookie;
          if(distrb[i] == 0) break;
         }


    }
}
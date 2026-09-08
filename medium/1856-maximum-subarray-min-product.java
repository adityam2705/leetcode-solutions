class Solution {
    public int maxSumMinProduct(int[] nums) {
       int n=nums.length;
       Deque<Integer> st= new ArrayDeque<>(); 
       long[] prefix= new long[n+1];
       int[] pse = new int[n];
       int[] nse= new int[n];
       for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];}     

        for(int i=0;i<n;i++){
           while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();}
               pse[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i); }

                st.clear(); 

        for(int i=n-1;i>=0;i--){
             while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();}
             nse[i] = st.isEmpty() ? n : st.peek();
                st.push(i);}

         long ans=0;
         for(int i=0;i<n;i++){
            long sum= prefix[nse[i]]-prefix[pse[i]+1];
             ans=Math.max(ans,sum*nums[i]); }

            return (int)(ans % 1_000_000_007);
    }
}
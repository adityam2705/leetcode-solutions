class Solution {
    public int[] dailyTemperatures(int[] temperatures) {  int n=temperatures.length;
    Deque<Integer> st = new ArrayDeque<>();
    int[]ans= new int[n];
 for(int i=n-1;i>=0;i--){
     while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
      st.pop();
     }
     
if(st.isEmpty()==false){ans[i]=st.peek()-i;}   
 st.push(i);
   
   }
    return ans;
    }
}
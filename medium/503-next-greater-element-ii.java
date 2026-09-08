class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> s =new Stack<>();
        int [] arr = new int[n];
        for(int num=2*n-1;num>=0;num--){
           while(!s.empty() && s.peek()<=nums[num%n]){
            s.pop();
           }
           if(num<n){
           arr[num]= s.empty()?-1:s.peek();
           }
           s.push(nums[num%n]);
        }
        return arr;
    }
}
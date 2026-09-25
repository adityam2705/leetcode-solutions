class Solution {
    public int maximumSum(int[] nums) {
        
    int nodelete=nums[0];
    int onedelete=0;
    int ans=nums[0];

    for(int i=1;i<nums.length;i++){
        
        int previousnodelete=nodelete;

        //nodelete
        nodelete=Math.max(nums[i],nodelete+nums[i]);
        
        //1delete
        onedelete=Math.max(previousnodelete,onedelete+nums[i]);
        
        ans=Math.max(ans,Math.max(nodelete,onedelete));

        }

    return ans;
    }
}
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1)return true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int middle= (int) Math.ceil((double)nums.length/2);
        if(map.get(nums[middle-1])==1) return true;
         return false;
    }
}
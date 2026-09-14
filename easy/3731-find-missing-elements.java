class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
           max=Math.max(nums[i],max);
           min=Math.min(nums[i],min);}

        while(max>min){
            if(!set.contains(min))list.add(min);   
             min++;
           }

           
     return list;

    }
}
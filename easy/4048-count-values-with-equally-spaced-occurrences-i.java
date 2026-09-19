class Solution {
    public int countSpecialIntegers(int[] nums) {

    int count=0;
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

    for(int i=0;i<nums.length;i++){
    map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);}

    for( ArrayList<Integer> list : map.values()) {

    if(list.size()==3){

        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        
        if(b-a==c-b)count++;}   }


   return count;
    }
}
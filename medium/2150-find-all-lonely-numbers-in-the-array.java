class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
          map.put(i,map.getOrDefault(i,0)+1); }

        for(int i:map.keySet()){
            if(map.get(i)==1 && !map.containsKey(i-1) && !map.containsKey(i+1)){
                result.add(i);
            }  
        }
    
    return result;}
}
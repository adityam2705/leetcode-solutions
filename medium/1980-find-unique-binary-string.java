class Solution { 
    String result="";   
    public String findDifferentBinaryString(String[] nums) {

    int n=nums[0].length();
    HashSet<String> set = new HashSet<>();

    for(int i=0;i<nums.length;i++){
      set.add(nums[i]);}

    backtrack("",n,set);
    
    return result; }
 
   boolean backtrack(String curr, int n,HashSet set){

     if(curr.length()==n){
       if(!set.contains(curr)){
        result=curr;
        return true;}
        return false;}

      if(backtrack(curr+"0",n,set))return true;

      if(backtrack(curr+"1",n,set))return true;

    return false;
   }

}
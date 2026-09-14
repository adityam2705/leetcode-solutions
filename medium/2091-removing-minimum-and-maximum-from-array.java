class Solution {
    public int minimumDeletions(int[] nums) {
     
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    boolean f=false;
    boolean s=false;
    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;

      for(int i=0;i<nums.length;i++){
         min=Math.min(nums[i],min);
          max=Math.max(max,nums[i]);  }

      // first
      for(int i=0;i<nums.length;i++){
         
        if(nums[i]==min){f=true;}
        if(nums[i]==max){s=true;}         
     
         if(f && s){
            count1=i+1;
            break;}    }
        
        //second
        f=false;
        s=false;

       for(int i=nums.length-1;i>=0;i--){
         
        if(nums[i]==min){f=true;}
        if(nums[i]==max){s=true;}         
     
        if(f && s){
            count2=nums.length-i;
            break;}    }
     
        //third

       for(int i=0;i<nums.length;i++){
          if(nums[i]==max || nums[i]==min){
             count3=i+1;
             break;} }
       
        for(int i=nums.length-1;i>=0;i--){
          if(nums[i]==max || nums[i]==min){
             count4=nums.length-i;
             break;} }

         
       return Math.min(Math.min(count1,count2),count3+count4); 

    }
}
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        
        long completed = 0;
        int n=tasks.length;
        long[]prefix= new long[n];
        
         prefix[0]=tasks[0];
        for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]+tasks[i];}

         long total=prefix[n - 1];

     for(int i=0;i<shifts.length;i++){
               completed+=shifts[i];

         if(completed>=total){
                shifts[i]=0;
                completed=0;
                continue;}

          int left=0,right=n-1;
            while(left<right){
                int mid=left+(right-left)/2;
                if(prefix[mid]>completed) {
                    right = mid;}
                     else{
                    left=mid+1; }  }

       shifts[i]=n-left;
                                }
               
  return shifts;
    }
}
class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        
    int bestmin=Integer.MAX_VALUE; 
    int minL=Integer.MAX_VALUE;    
    int result=Integer.MAX_VALUE;
    int i=0;
    int j=0;
    int n=arr.length;
    int[] pil=new int[n];
    Arrays.fill(pil,Integer.MAX_VALUE);
    int sum=0;

        while(j<n){
            sum+=arr[j]; 

            while(sum>target){         
                sum-=arr[i];
                i++;
               }

            if(target==sum){
                int len=j-i+1;

              if(i>0 && pil[i-1]!=Integer.MAX_VALUE){
                result=Math.min(result,len+pil[i-1]);}
                 
                bestmin=Math.min(bestmin,len);}

                pil[j]=bestmin;  
                j++;
       }
    
    return (result==Integer.MAX_VALUE)?-1:result;
    }
}
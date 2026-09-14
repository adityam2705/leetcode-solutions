class Solution{
    String result ="";
    int count=0;
    public String getHappyString(int n, int k) {
StringBuilder sb = new StringBuilder();

   char[] arr = {'a', 'b', 'c'};

       backtrack(n,arr,-1, sb, k);
       
return result;
    }
    
void backtrack(int n, char[] arr, int parent,StringBuilder sb,int k){
       if(count==k){
      return;}
      
      if(n==sb.length()){
          count++;
if(count==k) result=sb.toString();
          return;}
          
    for(int i=0;i<3;i++){
        if(i==parent){continue;}
        sb.append(arr[i]);
        backtrack(n,arr,i,sb, k);
        sb.deleteCharAt(sb.length() - 1);
    }
    
        
    }
}
class Solution {
    int count=0;
    public int totalNumbers(int[] digits) {
    
    boolean[] used = new boolean[digits.length];
    
    HashSet<Integer> set= new HashSet<>();

    solve(digits,0,0,set,used);
    
    return count;
    }

    void solve(int[] digits,int len,int num,HashSet<Integer> set,boolean[] used){

    if(len==3){

    if(num>=100 && num%2==0 && set.add(num)){count++;}
      
       return;}


    for(int j=0;j<digits.length;j++){
    
    if(used[j])continue;

    if(len==0 && digits[j]==0) continue;

    if(len==2 && digits[j]%2!=0)continue;

    used[j]=true;

    solve(digits,len+1,num*10+digits[j],set,used);
    
    used[j]=false;}

    }
}
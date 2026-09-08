class Solution {
    public int countRotations(String s, int k) {

      int count=0;
      int ans=0;

    for(int i=0;i<s.length();i++){
       
       String curr=s.substring(i,s.length())+s.substring(0,i);
        
        int comp=check(curr);

        if(comp==k)count++;

        }
    
    return count;}

    int check(String curr){

        int count=0;

        for(int i=0;i<curr.length()-1;i++){
        
        if(curr.charAt(i)==curr.charAt(i+1))count++;
        }

        return count;
    }
}
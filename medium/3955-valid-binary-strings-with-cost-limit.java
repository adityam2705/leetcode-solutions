class Solution {
    List<String> result=new ArrayList<>();
    public List<String> generateValidStrings(int n, int k) {
    
       solve(n,k,"");
      return result;
    }

   void solve(int n,int k,String s){

        if(s.length()==n){
           
           int cost=cal(s);

           if(cost<=k){
            result.add(s);}
           
           return;}

       solve(n,k,s+'0');

       if(s=="" || s.charAt(s.length()-1)!='1'){
          solve(n,k,s+'1');}
       
    }

    int cal(String s){

        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){count+=i;}}

            return count;
    }
}
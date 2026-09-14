class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        boolean cond = true;
        int j=0;
        int i=0;
       while(j<=n && i<target.length){
        if(target[i]==j+1 ){
        result.add("Push");
              i++;}
        else{ result.add("Push");
              result.add("Pop");
              }
              j++;}
              return result;
    }
    }

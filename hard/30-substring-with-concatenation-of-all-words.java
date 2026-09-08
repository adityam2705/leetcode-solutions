class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
          if (words.length == 0 || s.length() == 0) {
            return ans;
        }
        int n=words[0].length();
        int m=words.length;
        int o=s.length();
        String curr;
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(int i=0;i<n;i++){
            int start=i;
            int count=0;
             HashMap<String,Integer> currmap= new HashMap<>();
             for(int j=i; j+n<=o;j+=n){
            curr=s.substring(j,j+n);
                    if(map.containsKey(curr)){
                        currmap.put(curr,currmap.getOrDefault(curr,0)+1);
                        count++;
                        while(currmap.get(curr)>map.get(curr)){
                            String startWord = s.substring(start,start+n);
                            currmap.put(startWord,currmap.get(startWord)-1);
                            start+=n;
                            count--;
                        }
                        if(count==m){
                            ans.add(start);
                        }
                    }
                    else{
                        count=0;
                        start=j+n;
                        currmap.clear();
                    }

                    } 
        }
        return ans;
    }
}
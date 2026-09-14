class DSU{
    int[] parent;
    int[] rank;

    DSU(int n){
        parent=new int[n];
        rank=new int[n];

        for(int i=0;i<n;i++) {
            parent[i]=i;
        }
    }

    int find(int x){
        if(parent[x]!= x) {
            parent[x]=find(parent[x]); 
        }
        return parent[x];
    }

    void union(int x, int y) {
        int px=find(x);
        int py=find(y);

        if(px==py) return;

        if(rank[px]<rank[py]) {
            parent[px]=py;
        } 
        else if(rank[px]>rank[py]) {
            parent[py]=px;
        } 
        else{
            parent[py]=px;
            rank[px]++;
        }
    }
}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        int n=accounts.size();

        List<List<String>> result = new ArrayList<>();
        HashMap<Integer,List<String>> groups= new HashMap<>();
        HashMap<String,Integer> emailToAccount= new HashMap<>();

               DSU dsu = new DSU(n);

        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String email = accounts.get(i).get(j);
                if(!emailToAccount.containsKey(email)){
                    emailToAccount.put(email,i);}
                else{
                    int previousAccount=emailToAccount.get(email);
                    dsu.union(i,previousAccount);          }
            }
        }
     
       for(String email : emailToAccount.keySet()){
            int account = emailToAccount.get(email);
            int parent = dsu.find(account);

           groups.computeIfAbsent(parent, k -> new ArrayList<>()).add(email);}
 

        for(Map.Entry<Integer, List<String>> entry : groups.entrySet()){
              List<String> emails = entry.getValue();

                Collections.sort(emails);

                List<String> account = new ArrayList<>();
              
                int parent = entry.getKey();

                account.add(accounts.get(parent).get(0));

                account.addAll(emails);

                result.add(account);          
        }
      
     return result;
    }
}
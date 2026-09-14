class Solution {
    int[] parent;
    int[] rank ;
    public boolean equationsPossible(String[] equations) {
        parent = new int[26];
        rank = new int[26];

        for(int i=0;i<26;i++){parent[i]=i;}

        for(String s: equations){ // equal toh union
            if(s.charAt(1)=='='){
                Union(s.charAt(0)-'a',s.charAt(3)-'a',parent,rank);  }
        }
          
        for(String s: equations){  // not equal toh check
            if(s.charAt(1)=='!'){
                int parentx=find(s.charAt(0)-'a',parent);
                int parenty=find(s.charAt(3)-'a',parent); 
                
                if(parentx==parenty) return false;  }
        }
 
 return true;
    }

  void Union(int x, int y,int[]parent, int []rank){
       int xparent = find(x,parent);
       int yparent = find(y,parent);

      if(xparent==yparent)return;

      if(rank[xparent]>rank[yparent]){
        parent[yparent]=xparent;}

      else if(rank[xparent]<rank[yparent]){
        parent[xparent]=yparent;}

      else{parent[xparent]=yparent;
           rank[yparent]+=1;}
  

  }

 int find(int i , int[] parent){
       if(parent[i]==i)return i;

      return parent[i]=find(parent[i],parent); }


}


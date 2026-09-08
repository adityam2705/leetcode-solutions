class Solution {
    public int minimumRounds(int[] tasks) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
        map.put(tasks[i],map.getOrDefault(tasks[i],0)+1); }
          
        
    
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            if(value==1)return -1;
            if(value==2){count+=1 ; }
            else if(value%3==1){
                count+=(value+2)/3;}
            else if(value%3==2){
                count+=(value+1)/3;}
            else{ count+=value/3 ; }
                                          }
        
            return count;        } 
}
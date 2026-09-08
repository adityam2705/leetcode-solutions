class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int j=1;
        int[] temp = arr.clone();
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],j);    
            j++;}}

             for(int i=0;i<temp.length;i++){
            temp[i]=map.get(temp[i]);}
    
    return temp;}
}
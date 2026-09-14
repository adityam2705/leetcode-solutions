class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> result= new ArrayList<>();

        for(int i=0;i<n1;i++){
            set.add(nums1[i]);}

         for(int i=0;i<n2;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
                set.remove(nums2[i]);
            }
         }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
          ans[i] = result.get(i);}
return ans;
    }
}
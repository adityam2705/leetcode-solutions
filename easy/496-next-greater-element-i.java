class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st= new Stack<>();
        int ans[] = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums2){
            while(!st.empty() && st.peek()<num){
            map.put(st.pop(),num);}
            
            st.add(num);
        }
        int i = 0;
	for(int num : nums1) {
		ans[i++] = map.getOrDefault(num, -1);
	}

        return ans;
    }
}
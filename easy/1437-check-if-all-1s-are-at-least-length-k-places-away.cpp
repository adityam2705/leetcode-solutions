class Solution {
public:
    bool kLengthApart(vector<int>& nums, int k) {
        int j=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
               j=i+1;
            while(j<i+k+1 && j<nums.size()){
             if(nums[j]==1){
                return false; }
             j++;
             }
             i=j-1;
        }}
        return true;
    }
};
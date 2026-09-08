class Solution {
public:
    int totalFruit(vector<int>& fruits) {
    int n=fruits.size();
        int maxl=0;
     int l=0;
        int r=0;
        unordered_map<int, int> basket;
        while(r<n){
            basket[fruits[r]]++;
            if(basket.size()>2){
                basket[fruits[l]]--;
            if(basket[fruits[l]]==0){
                basket.erase(fruits[l]);}
            l++;}
if(basket.size()<=2){
    maxl=max(maxl,r-l+1);
}
     r++;  }
     return maxl;   }
        
};
class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> a(candies.size());
        int max=0;
        for(int i=0;i<candies.size();i++){
            if(candies[i]>max) max=candies[i];
        }
        for(int i=0;i<candies.size();i++){
            if(candies[i]+extraCandies >= max){
                a[i]=true;
            }
        }
        return a;
    }
};
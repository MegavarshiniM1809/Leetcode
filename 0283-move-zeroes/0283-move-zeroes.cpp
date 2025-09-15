class Solution {
public:
    void moveZeroes(vector<int>& nums) {
         int n=nums.size();
        int m=0;
        int l=0;
        while(m<n){
            if(nums[m]==0)
            m++;
            else{
                swap(nums[l],nums[m]);
                l++;
                m++;
            }
        }
    }
};
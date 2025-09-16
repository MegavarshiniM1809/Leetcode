class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int voter=nums[0];
        int vc=1;
        for(int i=1;i<nums.size();i++){
            if(vc==0){
                voter=nums[i];
            }
            if(nums[i]==voter)
            vc++;
            else
            vc--;
        }
        return voter;
    }
};
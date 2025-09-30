class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int m = 0;
        int h = nums.size() - 1;
        while (m <= h) { 
            if (nums[m] == val) {
                swap(nums[m], nums[h]); 
                h--; 
            } else {
                m++; 
            }
        }
        return m;  
    }
};

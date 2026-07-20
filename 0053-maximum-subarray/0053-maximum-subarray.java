class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            int currSum=sum+nums[i];
            sum=Math.max(nums[i],currSum);
            res=Math.max(sum,res);
        }
        return res;
    }
}
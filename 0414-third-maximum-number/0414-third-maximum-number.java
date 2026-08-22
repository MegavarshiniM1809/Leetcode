class Solution {
    public int thirdMax(int[] nums) {
        long max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max)max=nums[i];
        }
        long secMax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max)secMax=Math.max(secMax,nums[i]);
        }
        if(secMax==Long.MIN_VALUE)return (int)max;

        long thirdMax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<secMax)thirdMax=Math.max(nums[i],thirdMax);
        }
        if(thirdMax==Long.MIN_VALUE)return (int)max;
        return (int)thirdMax;
    }
}
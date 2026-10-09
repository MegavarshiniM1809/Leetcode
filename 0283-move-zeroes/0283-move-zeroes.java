class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0,p2=0;
        while(p2<nums.length){
            if(nums[p2]!=0 && nums[p1]!=0){
                p2++;
                p1++;
            }else if(nums[p2]!=0){
                int temp=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
                p2++;
                p1++;
            }
            else p2++;
        }
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []res =new int[2];
        int start=-1;
        int end=-1;
        boolean isStart=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && isStart==false){
                start=i;
                isStart=true;
            }
            if(nums[i]==target && isStart==true)end=i;
        }
        res[0]=start;
        res[1]=end;
        return res;
    }
}
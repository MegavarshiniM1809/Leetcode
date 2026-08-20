class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                idx = i-1;
                break;
            }
        }
        if (idx==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        int i=idx+1;
        int j=n-1;
            while(i<=j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>res=new ArrayList<>();
        int []freq=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-1]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0)res.add(i+1);
        }
        return res;
    }
}
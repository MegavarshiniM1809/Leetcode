class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length-2;
        int []freq=new int[n];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1)list.add(i);
        }
         int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
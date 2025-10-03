class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxcount=0,maxlength=0;
        int[] count=new int[26];
        for(int right=0;right<s.length();right++){
            count[s.charAt(right)-'A']++;
            maxcount=Math.max(maxcount,count[s.charAt(right)-'A']);
            while((right-left+1)-maxcount>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
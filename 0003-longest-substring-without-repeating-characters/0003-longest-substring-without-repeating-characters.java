class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0,j=0;
        int max=0;
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),j);
                j++;
                max=Math.max(max,(j-i));
            }
            else{
                i=Math.max(map.get(s.charAt(j))+1,i);
                map.put(s.charAt(j),j);
                j++;
                max=Math.max(max,(j-i));
            }
        }
        return max;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        int count=0;
      HashMap<Character, Integer> freq = new HashMap<>();
      for(char ch:s.toCharArray()){
         if (freq.containsKey(ch)) {
        freq.put(ch, freq.get(ch) + 1);
    } else {
        freq.put(ch, 1);
    }
      }
    for (int a : freq.values()) {
        if(a%2==0)count+=a;
        else {
            count=count+(a-1);
        }
}
for (int a : freq.values()) {
        if(a%2==1){
            count+=1;
            break;
            }
}
      return count;  
    }
}
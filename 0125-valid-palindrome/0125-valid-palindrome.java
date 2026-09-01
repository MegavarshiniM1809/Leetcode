class Solution {
    public boolean isPalindrome(String s) {
      int l=0;
      int r=s.length()-1;
      while(l<r){
        char ch1=s.charAt(l);
        char ch2=s.charAt(r);
        if((ch1>='a'&&ch1<='z')||(ch1>='A' && ch1<='Z')||(ch1>='0' && ch1<='9')){
            if((ch2>='a'&&ch2<='z')||(ch2>='A' && ch2<='Z')||(ch2>='0' && ch2<='9')){
                if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2))return false;
                else {
                    l++;
                    r--;
                }
            }
            else r--;
        }
        else l++;
      }
      return true;
    }
}
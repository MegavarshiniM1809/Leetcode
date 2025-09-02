class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder dup=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)<97 || s.charAt(i)>122){
            if((s.charAt(i)<97 || s.charAt(i)>122)&&(s.charAt(i)<65 || s.charAt(i)>90)&&(s.charAt(i)<'0'||s.charAt(i)>'9')){
                continue;
            }
            else{
                dup.append((char)(s.charAt(i) + 32));
            }
        }
        else{
            dup.append(s.charAt(i));
        }
     }
     String original = dup.toString();
     String reversed = new StringBuilder(dup).reverse().toString();

if (original.equals(reversed)) {
    return true;
} return false;
     
    }
}
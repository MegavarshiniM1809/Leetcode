class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean flag=true;
        int prev=n&1;
        n>>=1;
        while(n>=1){
            int curr=n&1;
            if(prev==curr)return false;
            prev=curr;
            n>>=1;
        }
        return flag;
    }
}
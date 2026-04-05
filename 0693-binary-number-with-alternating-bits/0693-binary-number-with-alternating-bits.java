class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean flag=true;
        int prev=n%2;
        n=n/2;
        while(n>=1){
            int curr=n%2;
            n=n/2;
            if(prev==curr)return false;
            prev=curr;
        }
        return flag;
    }
}
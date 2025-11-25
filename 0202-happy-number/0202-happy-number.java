class Solution {
    int sumOfDigits(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d*d;
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
        slow=sumOfDigits(slow);
        fast=sumOfDigits(sumOfDigits(fast));
        if(slow==fast)break;
        }
        return fast==1;
    }
}
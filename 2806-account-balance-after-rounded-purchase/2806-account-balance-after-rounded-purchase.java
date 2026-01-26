class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int round;
        if(purchaseAmount<=4)round=0;
        else if(purchaseAmount<=14)round=10;
        else if(purchaseAmount<=24)round=20;
        else if(purchaseAmount<=34)round=30;
        else if(purchaseAmount<=44)round=40;
        else if(purchaseAmount<=54)round=50;
        else if(purchaseAmount<=64)round=60;
        else if(purchaseAmount<=74)round=70;
        else if(purchaseAmount<=84)round=80;
        else if(purchaseAmount<=94)round=90;
        else round=100;
        return 100-round;
    }
}
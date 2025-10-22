class Solution {
    int f(int num){
        if(num<10)return num;
            int sum=0;
            while(num!=0){
                 sum=sum+(num%10);
                num/=10;
            }
        return f(sum);
    }
    public int addDigits(int num) {
        return(f(num));
}
}
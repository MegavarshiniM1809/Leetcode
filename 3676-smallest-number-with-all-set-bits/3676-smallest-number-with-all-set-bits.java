class Solution {
    public int smallestNumber(int n) {
       for(int i=1;i<=Integer.MAX_VALUE;i++){
        if((int)(Math.pow(2,i))-1>=n)return (int)(Math.pow(2,i)-1);
       } 
       return -1;
    }
}
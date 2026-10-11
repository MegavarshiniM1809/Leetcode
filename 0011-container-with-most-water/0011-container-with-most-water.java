class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        int prod=0;
        while(l<r){
            prod=height[l]<height[r]?height[l]*(r-l):height[r]*(r-l);
            max=Math.max(max,prod);
            if(height[l]<height[r])l++;
            else r--;
        }
        return max;
    }
}
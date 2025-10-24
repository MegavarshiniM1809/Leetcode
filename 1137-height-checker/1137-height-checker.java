class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int []curr=new int[heights.length];
        for(int i=0;i<heights.length;i++)curr[i]=heights[i];
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(curr[i]!=heights[i])c++;
        }
        return c;
    }
}
class Solution {
    public int passThePillow(int n, int time) {
        int i=1;
       while(time>0){
        if(i<n){
            while(i<n && time>0){
                i++;
                time--;
            }
        }
        else{
            while(i>1 && time>0){
                i--;
                time--;
            }
        }
       } 
       return i;
    }
}
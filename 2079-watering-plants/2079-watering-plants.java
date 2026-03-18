class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int can=capacity;
        int refill=0;
        int i=0;
        while(i<plants.length){
            if(can>=plants[i]){
                if(refill>0){
                    steps+=refill+1;
                    refill=0;
                    can=can-plants[i];
                    i++;
                }
                else{
                steps++;
                can=can-plants[i];
                i++;
                }
            }
            else{
                refill=i;
                steps+=refill;
                can=capacity;
            }
        }
        return steps;
    }
}
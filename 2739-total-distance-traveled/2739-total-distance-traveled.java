class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dist=0;
      while(mainTank>0){
        if(mainTank>=5){
            mainTank=mainTank-5;
            dist=dist+(5*10);
            if(additionalTank>=1){
                mainTank++;
                additionalTank--;
            }
        }
        else{
            dist=dist+(mainTank*10);
            mainTank=0;
        }
      }
      return dist;  
    }
}
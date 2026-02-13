int numWaterBottles(int numBottles, int numExchange) {
      int d=numBottles;
      int empt=numBottles;
      while(empt>=numExchange){
        if(empt%numExchange==0){
            empt=empt/numExchange;
            d=d+empt;
        }
        else{
            int extra=empt%numExchange;
            empt=empt/numExchange;
            d+=empt;
            empt=empt+extra;
        }
      }
      return d;
}
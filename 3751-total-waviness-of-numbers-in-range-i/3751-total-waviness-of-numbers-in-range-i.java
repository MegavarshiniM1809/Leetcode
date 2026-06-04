class Solution {
    public int totalWaviness(int num1, int num2) {
        int wave=0;
      for(int i=num1;i<=num2;i++){
        List<Integer>list=new ArrayList<>();
        int num=i;
        while(num!=0){
            int rem=num%10;
            list.add(rem);
            num=num/10;
        }
        Collections.reverse(list);
        for(int j=1;j<list.size()-1;j++){
            int peak=0;
            int valley=0;
            if(list.get(j)>list.get(j-1)&&list.get(j)>list.get(j+1)){
                peak++;
            }
            if(list.get(j)<list.get(j-1)&&list.get(j)<list.get(j+1)){
                valley++;
            }
            wave=wave+peak+valley;
        }
      } 
      return wave;
    }
}
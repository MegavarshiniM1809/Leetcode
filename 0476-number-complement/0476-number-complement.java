class Solution {
    public int findComplement(int num) {
       int count=1;
       int temp=num;
      while(temp!=1 && temp!=0){
        temp=temp/2;
        count++;
      }  
      int res=num^(int)(Math.pow(2,count)-1);
      return res; 
    }
}
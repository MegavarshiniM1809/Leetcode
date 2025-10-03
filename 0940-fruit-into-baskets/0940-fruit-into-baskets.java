class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>s=new HashMap<>();
        int left=0,m=0;
        for(int i=0;i<fruits.length;i++){
            s.put(fruits[i],s.getOrDefault(fruits[i],0)+1);
            while(s.size()>2){
                s.put(fruits[left],s.get(fruits[left])-1);
                if(s.get(fruits[left])==0){
                    s.remove(fruits[left]);
                }
                left++;
                
            }
            m=Math.max(m,i-left+1);
        }
        return m;
    }
}
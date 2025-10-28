class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean isSelfDivide =true;
            int a=i;
                while(a!=0){
                    int digit=a%10;
                    if(digit==0||i%digit!=0){isSelfDivide=false;
                    break;}
                    else{
                        a=a/10;
                    }
                }
                if(isSelfDivide)res.add(i);
        }
        return res;
    }
}
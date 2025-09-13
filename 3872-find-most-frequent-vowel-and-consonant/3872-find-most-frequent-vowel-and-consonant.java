class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(!map.containsKey(a))map.put(a,1);
            else map.put(a,map.get(a)+1);
        }
        int maxVowel=0;
        int maxConsonant=0;
        for(char a:map.keySet()){
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                if(map.get(a)>maxVowel){
                    maxVowel=map.get(a);
                }
            }
            else{
                if(map.get(a)>maxConsonant){
                    maxConsonant=map.get(a);
                }
            }
        }
        return maxConsonant+maxVowel;
    }
}
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int []res=new int[n];
        int []freq=new int[n+1];
        freq[0]=0;
        for(int i=0;i<n;i++){
            int count=0;
            freq[A[i]]++;
            freq[B[i]]++;
            for(int j=0;j<n+1;j++){
                if(freq[j]==2)count++;
            }
            res[i]=count;
        }
        return res;
    }
}
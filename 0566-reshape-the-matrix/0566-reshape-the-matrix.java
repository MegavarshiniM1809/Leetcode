class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length)return mat;
        int [][]res=new int[r][c];
        ArrayList<Integer> oneD=new ArrayList<>();
        for (int[] row : mat) {
            for (int a : row) {
                oneD.add(a);
                }
                }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(k<=oneD.size()){
                res[i][j]=oneD.get(k++);
                }
            }
        }
        return res;
    }
}
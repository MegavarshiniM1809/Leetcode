class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;;
        for(int i=0;i<arr.length-1;i++){
                int sub=arr[i+1]-arr[i];
                if(sub<minDiff)minDiff=sub;
        }
        for(int i=0;i<arr.length-1;i++){
                if(Math.abs(arr[i+1]-arr[i])==minDiff){
                    List<Integer>sub=new ArrayList<>();
                    sub.add(arr[i]);
                    sub.add(arr[i+1]);
                    list.add(sub);
                }
        }
        return list;
    }
}
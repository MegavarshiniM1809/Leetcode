class Solution {
public:
static bool cmplt(vector<int>&a, vector<int> &b){
    return a[1]<b[1];
}
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        int cet=-50000;
        int removedCount=0;
        sort(intervals.begin(),intervals.end(), cmplt);
        for(int i=0;i<intervals.size();i++){
                if(intervals[i][0]>=cet)cet=intervals[i][1];
                else removedCount++;
        }
        return removedCount;
    }
};
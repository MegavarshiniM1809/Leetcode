class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rectangles) {
        long long pc=0;
        unordered_map<double ,int>m;
        for (auto &r : rectangles) {
            double ratio = (double)r[0] / r[1];
            m[ratio]++;
        }
        for (auto &entry : m) {
            long long c = entry.second;
            pc += (c * (c - 1)) / 2;
        }

        return pc;
    }
};

class Solution {
public:
        
    long long continuousSubarrays(vector<int>& nums) {
           int n = nums.size(),head=0,tail=0;
          long long  ans = 0;
          deque<int> mxq, mnq;
     
    for (head=0; head < n; head++) {
        while (!mxq.empty() && mxq.back() < nums[head])  
            mxq.pop_back();                                   // we have to pop back of mxq so that we can insert nums[head] at correct place
        while (!mnq.empty() && mnq.back() > nums[head])    // if current element is less than back of mnq means
            mnq.pop_back();                                // pop back of mnq so that we can insert nums[head] means current element at correct place
        
///////////////////////// to maintain monotonicity of mxq and mnq we are doing above two operations ////////////////////////////////////
        
        mxq.push_back(nums[head]);         // now you can insert it in mxq
        mnq.push_back(nums[head]);         // now you can insert it in mnq

        while (mxq.front() - mnq.front() > 2) {  // if differencd b/w largest and smallest element of current window is > 2
            if (mxq.front() == nums[tail])      // remove largest element from mxq i.e its front value if its equal to nums[tail]
                mxq.pop_front();
            if (mnq.front() == nums[tail])     // remove smallest element from mnq i.e its front value if its equal to nums[tail]
                mnq.pop_front();
            tail++;  // move window forward
        }
        ans += head - tail + 1;  // count subarrays
    }

    return ans;
    }
};
class Solution {
    public int longestOnes(int[] nums, int k) {
       
       int left = 0;
       int zeroCount = 0;
       int maxAns = 0;

       for(int r = 0; r < nums.length; r++){

        if(nums[r] == 0){
            zeroCount++;
        }

        if(zeroCount > k){
            if(nums[left] == 0){
                zeroCount--;
            }
            left++;
        }
        maxAns = Math.max(maxAns, r - left + 1);
       }

       return maxAns;
    }
}

// 1 1 0 0 0 0 0 1 1 
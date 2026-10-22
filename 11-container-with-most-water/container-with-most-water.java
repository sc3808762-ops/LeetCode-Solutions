class Solution {
    public int maxArea(int[] nums) {
        
       int left = 0;
       int right = nums.length - 1;

       int maxArea = 0;

       while(left < right){
        int hight = Math.min(nums[left],nums[right]);
        int width = right - left;

        int area = hight * width;

        maxArea = Math.max(area, maxArea);

        if(nums[left] <= nums[right]){
            left++;
        }else{
            right--;
        }
       }

       return maxArea;
    }
}
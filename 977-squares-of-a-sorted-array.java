//https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int k = len - 1;
        int[] ans = new int[len];
        while(left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];            
            if(leftSq >= rightSq) { 
                ans[k--] = leftSq;
                left++;
            }
            else if(rightSq > leftSq) {
                ans[k--] = rightSq;
                right--;
            }
        }
        return ans;
    }
}

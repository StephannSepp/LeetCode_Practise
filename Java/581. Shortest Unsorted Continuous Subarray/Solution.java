class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = 0, start = 1;
        int max = nums[0];
        int min = nums[nums.length - 1];
        
        for (int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            if (max > nums[i]){
                end = i;
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--){
            min = Math.min(min, nums[i]);
            if (min < nums[i]){
                start = i;
            }
        }
        
        return end - start + 1;
    }
}
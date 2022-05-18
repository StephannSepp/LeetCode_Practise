class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i < nums.length; i++){
            nums[(i+k) % nums.length] = arr[i];
        }
    }
}
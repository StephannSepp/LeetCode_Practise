class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int first = 0, last = n -1;
        for (int i = 0; i < n; i++){
            if (nums[i]%2 == 0){
                arr[first] = nums[i];
                first++;
            } else {
                arr[last] = nums[i];
                last--;
            }
        }
        return arr;
    }
}
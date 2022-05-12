class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int m = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i > 0 - 1; i--){
            if (nums[i] < m){
                return true;
            }
            
            while (!st.isEmpty() && nums[i] > st.peek()){
                m = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
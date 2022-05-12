class Solution {
    public HashSet<List<Integer>> result = new HashSet<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        helper(new ArrayList<>(), nums, 0, new boolean[nums.length]);
        return new ArrayList<>(result);
    }
    
    public void helper(List<Integer> temp, int[] nums, int index, boolean[] seen){
        if (index == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = 0; i < nums.length; i++){
            if (!seen[i]){
                seen[i] = true;
                temp.add(nums[i]);
                helper(temp, nums, index + 1, seen);
                temp.remove(temp.size() - 1);
                seen[i] = false;
            }
        }
    }
}
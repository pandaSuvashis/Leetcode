class Solution {
    public int removeDuplicates(int[] nums) {
        int unique =0;
        for(int n =1; n<nums.length; n++){
            if(nums[n] != nums[unique]){
                unique++;
                nums[unique] = nums[n];
            }
        }
        return unique+1;
    }
}
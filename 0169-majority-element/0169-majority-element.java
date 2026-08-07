class Solution {
    public int majorityElement(int[] nums) {
        int countVote =0, candidate =0;

        for (int n : nums){
            if(countVote == 0 ){
                candidate =n;
            }
            if(n == candidate) countVote++;
            else countVote--;
        }
    return candidate;
    }
}
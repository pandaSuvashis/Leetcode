class Solution {
    public int missingNumber(int[] nums) {
       int XorSum =0;
            for(int n :  nums){
                XorSum ^= n;
            }
            int n =  nums.length;
            for(int i=0; i<=nums.length;i++){
                XorSum ^=i;
            }

            return XorSum;
    }
}

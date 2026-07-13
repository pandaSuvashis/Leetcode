class Solution {
    public int pivotIndex(int[] nums) {
        
        int n =nums.length;
        int left_sum[] = new int[n];
        int right_sum[] = new int[n];

        left_sum[0] = nums[0];
        for(int i=1 ; i<n; i++){
            left_sum[i] = left_sum[i-1]+ nums[i];
        }
        right_sum[n-1] = nums[n-1];
        for(int j=n-2 ; j>=0; j--){
            right_sum[j] = right_sum[j+1] + nums[j];
        }


        for(int i=0 ; i<n ; i++){
            if(left_sum[i] == right_sum[i]){
                return i;
            }
        }

        return -1;
    }
}
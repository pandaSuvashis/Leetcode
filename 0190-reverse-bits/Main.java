class Solution {
    public int reverseBits(int n) {
        int bits[] =  new int[32];
        for(int i=0;  i<bits.length ;i++){
            bits[i] = n&1;
            n >>>=1;
        }

        int ans=0;
        for(int i=0;i<bits.length;i++){
            ans =(ans <<1 ) | bits[i];
        }
        return ans;
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length() -1;
        int len =0;

        // lp1: i>=0 && 's[i] ==" "; i--;
        while(i >=0 && s.charAt(i) == ' '){
            i--;
        }

        // lp2: i>=0 && s[i] not == " ";
         while(i >=0 && s.charAt(i) != ' '){ 
        len+=1;
        i--;
         }

         return len;
    }
}
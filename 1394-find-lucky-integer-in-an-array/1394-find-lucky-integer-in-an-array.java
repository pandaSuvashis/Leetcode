class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> map =  new HashMap<>();
        // map.put(key, map.getOrDefault(key, 0) + 1);
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getKey().equals(entry.getValue())) { 
                ans = Math.max(ans, entry.getKey());          
            } 
        }
        return ans;

    }
}
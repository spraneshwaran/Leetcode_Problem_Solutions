class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=nums.length,j=0;i>=0;i--){
            for(var entry : map.entrySet()){
                if(entry.getValue() == i && j<k){
                    freq[j++]=entry.getKey();
                }
            }
            
        }
        return freq;
    }
}
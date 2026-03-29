class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> freqs = new HashMap<>();
         for(int i= 0; i < nums.length; i++) {
            if(freqs.get(nums[i]) != null) {
                freqs.put(nums[i], freqs.get(nums[i]) + 1);
            } else {
                freqs.put(nums[i], 1);
            }
         }

         List<Integer> [] bucket = new List[nums.length + 1];
         for(int key : freqs.keySet()) {
            int freq = freqs.get(key);
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
         }

         List<Integer> resList = new ArrayList<>();
         for(int i=bucket.length-1; i>=0 && resList.size() < k ; i--) {
            if(bucket[i] != null)
            resList.addAll(bucket[i]);
         }

        int [] result = new int[k];
         for(int i = 0; i < k; i++) {
            result[i] = resList.get(i);
         }
         return result;

    }
}

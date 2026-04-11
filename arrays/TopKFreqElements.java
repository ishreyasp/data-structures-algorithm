/**
Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:
Input: nums = [1,2,2,3,3,3], k = 2
Output: [2,3]
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TopKFreqElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList();
            }
            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if(buckets[i] != null) {
                for(int num : buckets[i]) {
                    result[index++] = num;
                    if(index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TopKFreqElements topKFreqElements = new TopKFreqElements();
        int[] res = topKFreqElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        for(int i : res) {
            System.out.print(i + " ");
        }
    }
    
}

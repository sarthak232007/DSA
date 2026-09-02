 import java.util.*;
 class solution {
    public List<Integer> majorityElement(int[] nums){
HashMap<Integer, Integer> map = new HashMap<>();
int n = nums.length;
int threshold = n/3;
       
 for (int num : nums) {

      map.put(num, map.getOrDefault(num, 0) + 1);
 }

 List<Integer> result = new ArrayList<>();
   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if(entry.getValue() > threshold) {
        result.add(entry.getKey());

    }
   }

return result;

    }

}

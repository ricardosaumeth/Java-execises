import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwo {

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        int[] value = new int[] { i, map.get(complement) };
        Arrays.sort(value);
        return value;
      }
      map.put(nums[i], i);
    }
    return new int[0];
  }
}

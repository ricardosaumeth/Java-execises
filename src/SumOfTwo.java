import java.util.HashMap;

public class SumOfTwo {
    public int[] twoSum (int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
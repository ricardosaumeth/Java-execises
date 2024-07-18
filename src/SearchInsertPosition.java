public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (i < nums.length - 1 && nums[i] < nums[i + 1] && nums[i + 1] > target) {
                return i + 1;
            }
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        return -1;


    }
}

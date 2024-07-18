public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int unique = 1; // Initialize the count of unique elements to 1
        for (int i = 1; i < nums.length; i++) {
            // 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6
            if (nums[i] != nums[unique - 1]) {
                nums[unique] = nums[i]; // Overwrite the next unique element
                unique++;
            }
        }

        return unique;
    }
}

class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];

        // Check every number from 1 to n
        for (int i = 1; i <= nums.length; i++) {

            int count = 0;

            // Count how many times i appears
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                ans[0] = i;      // Duplicate number
            }

            if (count == 0) {
                ans[1] = i;      // Missing number
            }
        }

        return ans;
    }
}
package Sorting;
// Q.3 Link --> https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(Cyclic(nums));
    }
    static int Cyclic(int[] nums) {
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] -1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                ans = nums[i];
                i++;
            }
        }
        return ans;
    }
}

package Sorting;
// Q.6 Link --> https://leetcode.com/problems/first-missing-positive/?source=submission-noac
public class FirstMissPositive {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] -1 ;

            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index +1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
}

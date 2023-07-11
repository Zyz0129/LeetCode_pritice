package LeetCode;

public class Num35 {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        int index=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==target){
                return i;
            }if(nums[i]<=target&&nums[i+1]>=target){
                index=i+1;
            }
        }
        return index;
    }
}

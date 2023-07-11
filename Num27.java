package LeetCode;

public class Num27 {
    public int removeElement(int[] nums, int val) {
        int p=nums.length-1;
        for (int i = 0; i < nums.length&&i<=p;) {
            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[p];
                nums[p]=nums[i];
                p--;
                continue;
            }
            i++;
        }
        return p+1;
    }
}

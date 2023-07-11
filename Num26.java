package LeetCode;

public class Num26 {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {
        int p1=0;
        int p2=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[p1]==nums[p2]){
                p2++;
            }else{
                p1++;
                int temp=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
                p2++;
            }
        }
        return p1+1;
    }
}

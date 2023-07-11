package LeetCode;

public class Num1 {

    public static int[] twoSum(int[] nums, int target) {
        int num;
        int []arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num = target - nums[i];
            if(get(nums,num,i)!=-1){
                arr[i]=1;
                arr[get(nums,num,i)]=1;
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
        }
        int []ans=new int[count];
        int z=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                ans[z]=i;
                z++;
            }
        }
        return ans;
    }
    public static int get(int []arr,int num,int biaoji){
        for (int i = 0; i < arr.length; i++) {
            if(biaoji==i){
                continue;
            }
            if(num==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
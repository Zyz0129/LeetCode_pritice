package LeetCode;

public class Num70 {

    public int climbStairs(int n) {
        int[] arr=new int[100];
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}

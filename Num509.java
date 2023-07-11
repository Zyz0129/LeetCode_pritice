package LeetCode;

public class Num509 {

    public static int fib(int n) {
        int[] arr=new int[100];
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}

package LeetCode;

import java.util.Arrays;

public class Num1646 {
    public int getMaximumGenerated(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int i=1;
        while(true){
            if(2*i<=n){
                arr[i*2]=arr[i];
            }
            if(2*i+1<=n){
                arr[2*i+1]=arr[i]+arr[i+1];
            }
            if(2*i>n||2*i+1>n){
                break;
            }
            i++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}

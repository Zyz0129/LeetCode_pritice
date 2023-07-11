package LeetCode;

public class Num746 {

    public int minCostClimbingStairs(int[] cost) {
        int[] value=new int[cost.length+1];
        int min=0;
        value[0]=cost[0];
        value[1]=cost[1];
        value[cost.length]=0;
        for(int i=2;i<cost.length;i++){
            min= Math.min(value[i-1],value[i-2]);
            value[i]=min+cost[i];
        }
        value[cost.length]=Math.min(value[cost.length-1],value[cost.length-2]);
        return value[cost.length];
    }
}

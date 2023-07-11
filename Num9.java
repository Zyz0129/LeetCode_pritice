package LeetCode;

public class Num9 {

    public static boolean isPalindrome(int x) {
        int a=x;
        int b=0;
        while(a>0){
            b=b*10+a%10;
            a=a/10;
        }if(x==b){
            return true;
        }else{
            return false;
        }
    }
}

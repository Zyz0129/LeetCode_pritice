package LeetCode;

public class Num2496 {
    public static void main(String[] args) {

    }
    public int maximumValue(String[] strs) {
        int i=0;
        int j=0;
        int max=0;
        for (i = 0; i < strs.length; i++) {
            for (j = 0; j < strs[i].length(); j++) {
                if(strs[i].charAt(j)<'0'||strs[i].charAt(j)>'9'){
                    if (strs[i].length()>max) {
                        max=strs[i].length();
                    }
                    break;
                }
            }
            if(j==strs[i].length()){
                int num=0;
                for(int k=0;k<strs[i].length();k++){
                    num=num*10+(int)(strs[i].charAt(k)-'0');
                }
                if(num>max){
                    max=num;
                }
            }
        }
        return max;
    }
}

package LeetCode;

public class Num58 {
    public int lengthOfLastWord(String s) {
        int num=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==' '){
                if(s.charAt(i+1)!=' '){
                    num=0;
                }
                continue;
            }else{
                num++;
            }
        }
        if(s.charAt(s.length()-1)!=' '){
            num++;
        }
        return num;
    }
}

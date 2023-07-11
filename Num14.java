package LeetCode;

public class Num14 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int min=strs[0].length();
        int index=0;
        int num;
        //ÕÒµ½×î¶ÌµÄ´®
        for (int i = 0; i < strs.length; i++) {
            if(min>strs[i].length()){
                min=strs[i].length();
                index=i;
            }
        }
        for (int i = min; i > 0; i--) {
            num=0;
            String s=strs[index].substring(0,i);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].startsWith(s)){
                    num++;
                }
            }
            if(num==strs.length){
                return s;
            }
        }
        return "";
    }
}

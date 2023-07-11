package LeetCode;

import java.util.Scanner;

public class Num13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int ans=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(pow(s.charAt(i))>=pow(s.charAt(i+1))){
                ans=ans+pow(s.charAt(i));
            }else{
                ans=ans-pow(s.charAt(i));
            }
        }
        ans=ans+pow(s.charAt(s.length()-1));
        System.out.println(ans);
    }
    static int pow(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}

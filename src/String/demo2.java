package String;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个字符串");
        String s1 = sc.next();
        String res = reverse(s1);
        System.out.println(res);
    }

    public static String reverse(String s1) {
        String res = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            char c=s1.charAt(i);
            res=res+c;
        }
        return res;
    }
}

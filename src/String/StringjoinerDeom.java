package String;

import java.util.StringJoiner;

//字符串的拼接
public class StringjoinerDeom {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("，","[","]");  //三个是间隔符号 开始符号 结束符号
        sj.add("aaa").add("bbb").add("ccc");  //只能添加字符串



        String str=sj.toString();
        System.out.println(str);
        System.out.println(sj);
    }
}

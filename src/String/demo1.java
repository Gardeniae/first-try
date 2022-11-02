package String;
//String 常用方法
//  ==基本数据类型比较的是数值大小 而引用数据类型比较的是地址值是否相同  equals  equalsIgnoreCase
public class demo1 {
    public static void main(String[] args) {
        String s1="Abc";
        String s2=new String("abc");
        // equals 完全一样  equalsIgnoreCase 忽略大小写比较字符串的内容
        System.out.println(s1.equalsIgnoreCase(s2));

        //遍历字符串

    }
}

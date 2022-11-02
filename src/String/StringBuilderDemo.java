package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //容器构造 创建对象
        StringBuilder sb=new StringBuilder("abc");

        //添加参数
        sb.append(1);
        sb.reverse();


        //返回字符串类型
        String str=sb.toString();
        System.out.println(sb);
    }
}

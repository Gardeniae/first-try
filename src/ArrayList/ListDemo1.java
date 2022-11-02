package ArrayList;

//链表/集合  不可以存储基本数据类型  基本数据类型--包装类

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //添加元素
        boolean bool = list.add("aaa");   //都会返回一个true
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");


        //删除元素
        boolean bl = list.remove("aaa");
        String str = list.remove(0);
        System.out.println(str);
        //查找元素
        String s=list.get(0);
        System.out.println(s);

        //修改元素
        String res=list.set(1,"aaa");
        System.out.println(res);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String st=list.get(i);
            System.out.println(st);
        }


    }
}

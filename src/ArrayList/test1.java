package ArrayList;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");


        System.out.printf("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.printf(list.get(i));
            }else{
                System.out.printf(list.get(i)+", ");
            }
        }
        System.out.printf("]");
    }
}

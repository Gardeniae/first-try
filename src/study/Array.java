package study;

public class Array {
    public static void main(String[] args) {
        int []arr={10,20,30};
        //快速访问数组的方法  数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //动态规划没有初始化的数组
        String [] array=new String[50];
        System.out.println(array[0]);
    }
}

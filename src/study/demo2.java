package study;
//方法的学习  函数的学习
public class demo2 {
    public static void main(String[] args) {
       //方法的调用
    //    play_game();
        int num1=10,num2=20;
        method(num1,num2);
        int result=method_return(10,20,30);
        System.out.println(result);
    }

    //定义格式 基本的函数
    public static void play_game()
    {
        System.out.println("hello world!");
        System.out.println("A new day");
        day();
    }
    public static void day(){
        System.out.println("i really rally hate you ");
    }

    //带参数的函数调用
    public static void method(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);
    }

    //函数的参数返回
    public static int method_return(int num1,int num2,int num3){
            int result=num1+num2+num3;
            return result;

    }


}

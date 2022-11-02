package day_13;

//表示最终的  可以修饰方法（不能被重写）、类（不能被继承）、变量（常量）
//引用数据类型 地址值不可以改变
public class FinalDemo {
    public static void main(String[] args) {

        final int a=20;       //常量不能被改变
    }

}


final class Fu {                               //父类不能被继承 
    public final void show() {                 //子类不能重写父类的show方法
        System.out.println("父类的show方法");
    }

}
/*
class Zi extends Fu{

}       */
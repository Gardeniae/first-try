package ExtendDemo;

public class Student extends Person{
    public  Student(){
        //优先构造父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        super(name,age);
    }
}

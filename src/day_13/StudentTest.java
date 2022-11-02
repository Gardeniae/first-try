package day_13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String teacher_name;
        System.out.println("请输入老师的姓名");
        teacher_name = sc.next();
        Student.Teacher = teacher_name;
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            String name;
            int age;
            String sex;
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            name=sc.next();
            stu.setName(name);
            System.out.println("请输入第" + (i + 1) + "个学生的年龄：");
            age=sc.nextInt();
            stu.setAge(age);
            System.out.println("请输入第" + (i + 1) + "个学生的性别：");
            sex=sc.next();
            stu.setSex(sex);

            list.add(stu);
        }
        show(list);
    }
    public static void show(ArrayList<Student> list)
    {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
    }
}

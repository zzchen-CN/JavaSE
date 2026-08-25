package oop.test2;

public class StudentsMain {
    static void main(String[] args) {
        StudentsTest S1 = new StudentsTest();
        S1.name = "张三";
        S1.Gender = "男";
        S1.age = 16;
        S1.height = 172.5;

        //输出S1学生的信息
        System.out.println(S1.name);
        System.out.println(S1.Gender);
        System.out.println(S1.age);
        System.out.println(S1.height);
    }
}

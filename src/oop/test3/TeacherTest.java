package oop.test3;

public class TeacherTest {
    static void main(String[] args) {
        Teacher t = new Teacher();

        //赋值
        t.name = "王老师";
        t.age = 32;

        //获取老师的信息并打印在控制台上
        System.out.println(t.name);
        System.out.println(t.age);

        //调用方法来让老师干活
        t.teach();
        t.eat();
        t.sleep();
    }
}

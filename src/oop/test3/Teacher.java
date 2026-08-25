package oop.test3;

public class Teacher {
    //练习：面向对象思想表示老师
    //属性：姓名，年龄
    //行为：授课，吃饭，睡觉


    //属性
    String name;
    int age;


    //行为
    //能干什么？方法的形式进行体现（不加static）
    //授课
    public void teach(){
        System.out.println("老师正在授课");
    }

    //吃饭
    public void eat(){
        System.out.println("老师正在吃饭");
    }

    //睡觉
    public void sleep(){
        System.out.println("老师正在睡觉");
    }
}

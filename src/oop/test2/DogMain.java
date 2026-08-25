package oop.test2;

public class DogMain {
    static void main(String []args){
        //创建第一只小狗的属性
        DogTest d1 = new DogTest();
        //给第一只小狗属性赋值
        d1.name ="旺财";
        d1.age = 1;
        d1.weight = 3.5;
        d1.color = "棕色";

        //获取第一只小狗的信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);
        System.out.println("-------------------");

        //创建第二只小狗的信息
        DogTest d2 = new DogTest();
        d2.name = "富贵";
        d2.age = 2;
        d2.weight = 2.5;
        d2.color = "白色";

        //获取第二只小狗信息
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);
    }
}

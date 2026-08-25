package oop.test4;

public class CookMain {
    static void main(String[] args) {
        Cook c = new Cook();
        c.name = "李四";
        c.age = 43;
        c.Cook_Skill_Level = 6;

        //输出厨师的属性
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.Cook_Skill_Level);


        //调用厨师的行为
        c.cook();
    }
}

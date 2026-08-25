package oop.test2;

public class PhoneMain {
    static void main(String[] args) {
        PhoneTest p = new PhoneTest();
        p.brand = "IPhone";
        p.model = "IPhone18 Pro Max";
        p.color = "白色";
        p.price = 8999;

        //输出手机的信息
        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.color);
        System.out.println(p.price);
    }
}

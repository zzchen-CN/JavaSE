package oop.test5;

public class WorkerMain {
    static void main(String[] args) {
        Worker w = new Worker();
        w.name = "张三";
        w.age = 45;
        w.working_years = 12;

        //输出信息
        System.out.println(w.name);
        System.out.println(w.age);
        System.out.println(w.working_years);

        //调用行为方法输出
        w.work();
    }
}

package methods;

public class methods_6 {
    static void main(String[] args) {
        /*方法重载
        * 同一个类中，定义了多个同名的方法，这些方法具有类似的功能
        * 每个方法具有不同的参数类型和参数个数，这些同名的方法，就构成了重载关系*/

        int a = 10;
        int b = 20;
        System.out.println(sum(a,b));
    }
//    public static double sum (int a , int b){
//        return a + b;
//    }

//    public static double sum (int a , double b){
//        return a + b;
//    }

//    public static double sum (double a , int b){
//        return a + b;
//    }

    public static double sum (double a , double b){
        return a + b;
    }
}

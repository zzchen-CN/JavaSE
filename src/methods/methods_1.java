package methods;

//方法：程序中的独立功能，也是最小的执行单元
public class methods_1 {
    public static void main(String[] args) {

        //练习：定义一个方法，求两个数的和

        //方法调用：方法名(参数1，参数2);
        int sum = getSum(10,20);
        System.out.println(sum);

    }

    public static int getSum (int a , int b){
        int sum = a + b;
        return sum;
    }
}

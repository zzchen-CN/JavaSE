package methods;
import java.util.Scanner;

public class MethodsAssignment3 {
    public static void main(String[] args) {
        /*计算快递邮费
        * 某快递公司的运费规则如下(首重1kg，超出部分按kg计算，不足1kg按1kg算):
        * 首重1kg:10元;
        * 超出1-5kg:每kg加2元;
        * 超出5kg以上:每kg加1.5元。
        * 键盘录入小数，表示用户快递的重量，计算最终的结果
        * 要求1:快递重量必须大于0，否则重新输入
        * 要求2:不同价位的计算，单独定义一个方法*/
        //首先我们需要接收用户输入的重量，如果输入的重量小于0那么就重新输入
        //用while来循环，接收用户输入的重量
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入物品重量：");
            double Weight = 0;
            Weight = sc.nextDouble();
            // 先在这里处理向上取整
            int w = (int) Weight;
            // 再根据向上取整后的 w 判断走哪个方法
            if (Weight > w) {
                w++;
            }
            if(Weight < 1 && Weight > 0){
                System.out.println("价格为：10元");
                break;
            }else if(Weight < 0){
                System.out.println("请输入正确的重量");
            }else if(Weight >= 1 && Weight <=5){
                //这里调用方法，专门针对超出1-5KG的值
                Over1_5kg(Weight);
                break;
            }else if(Weight > 5){
                //这里调用方法，专门针对超出5kg的值
                Over5kg(Weight);
                break;
            }
        }
    }
    //写一个超出1-5KG的方法
    public static void Over1_5kg(double Weight1) {
        // 1. 实现不足1kg按1kg算（向上取整）
        int w = (int) Weight1;      // 截取整数部分
        if (Weight1 > w) {          // 如果小数部分大于0
            w++;                    // 就加1kg
        }

        // 2. 定义变量，计算超出了多少kg
        int more = w - 1;

        // 3. 先计算出总价，再打印（避免字符串拼接问题）
        double total = 10 + (more * 2.0);

        System.out.println("超出了" + more + "kg，需要多支付：" + (more * 2.0) + "元");
        System.out.println("总价格为：" + total + "元");
    }
    //写一个超出5KG的方法
    public static void Over5kg(double Weight2) {
        // 1. 向上取整
        int w = (int) Weight2;
        if (Weight2 > w) {
            w++;
        }

        // 2. 计算超出了多少kg
        int more = w - 5;

        // 3. 先计算总价（首重10元 + 前4kg每kg2元 + 多出的部分每kg1.5元）
        double total = 10 + (4 * 2) + (more * 1.5);

        System.out.println("超出了" + more + "kg，需要多支付：" + (more * 1.5) + "元");
        System.out.println("总价格为：" + total + "元");
    }
}

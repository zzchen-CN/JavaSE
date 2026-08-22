package methods;
import java.util.Scanner;

public class MethodsAssignment1 {
    public static void main(String[] args) {
        /*作业1：评委打分、
        * 跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，
            剩余的分数再求平均数，改平均数为选手最终得分。
            要求1:利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
            要求2:定义方法分别求数组的最大值和最小值
            要求3:计算五名评委的总分
要            求4:总分-最大值-最小值，求选手最终平均分*/

        //1.先创建一个动态数组，将用户输入的五个整数存入数组中
        int arr[] = new int[5];
        //2.用循环接收用户键盘输入的数，并判断是否再0-100之间
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入五个分数:");
            //for循环接收五个分数
            for(int i = 0; i < 5; i++){
                arr[i] = sc.nextInt();
            }
            //需要定义一个判断，判断数组中是否还有错误的，如果有将继续循环，如果没有将跳出循环
            //for循环判断数组里的数有没有问题
            boolean B = false;
            for (int j = 0; j < 5; j++) {
                if(arr[j] > 100 || arr[j] < 0){
                    System.out.println("输入的分数有误，请重新输入");
                    B = true;
                    break;
                }
            }
            //利用if来判断数组还有没有问题，没有问题了就跳出while循环
            if(!B){
                break;
            }
        }

        //调用方法来获取最大值和最小值
        int Max = Max(arr);
        int Min = Min(arr);
        //计算总分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //求平均分
        System.out.println("选手最终得分：" + (sum - Max - Min));

    }

    //定义方法来求数组中的最大值
    public static int Max(int arr[]){
        int Max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    //定义方法来求数组中的最小值
    public static int Min(int arr[]){
        int Min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > Min){
                Min = arr[i];
            }
        }
        return Min;
    }
}

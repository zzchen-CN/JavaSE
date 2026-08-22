package methods;

import java.util.Scanner;

public class MethodsAssignment2 {
    public static void main(String[] args) {
         /*作业2：计算班级分数
        * 班主任需要统计10名学生的数学成绩(0-100分)，
        * 计算及格率，平均分，并找出最高分。
        * 要求1:键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”
        * 要求2:定义方法，求及格人数，根据及格人数，求及格率。
        * 要求3:定义方法求总分，根据总分求平均分
        * 要求4:定义方法求最大值。*/

        //1.定义一个动态数组
        double arr[] = new double[10];
        //2.需要接收用户输入的成绩
        Scanner sc = new Scanner(System.in);
        //用while循环来接收用户输入的数，我们不知道要循环几次所以用while，万一用户输入了5遍错误的信息呢
        while(true){
            //先不管用户输入的是否合规，先都存入数组中
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextDouble();
            }
            //这里我们定义布尔类型A为假，用来判断还是否需要进入while循环吗
            boolean A = false;
            //存进数组中后我们再进行循环判断，看一下是不是有不合规的
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > 100 || arr[j] < 0){
                    System.out.println("输入成绩有误，请重新输入");
                    //如果不合规，我们将A的值修改为真，这样又会从新进入while循环
                    A = true;
                    //判断如果有一个不合规的，那么我们直接跳出这个for循环，接着往下执行
                    break;
                }
            }
            //这里我们做一个判断，来判断A这个变量是否为假，如果为假，那么！A为真，我们将执行break，从而跳出while循环
            if(!A){
                break;
            }
        }

        //经过上面while循环后我们获得了一组正确的成绩，也就是数组arr
        //接下来我们需要调用一个方法，这个方法是用来求及格人数的，根据及格人数再求及格率，我们直接在方法中输出就行，所以返回值为void
        PassRate(arr);
        //接下来我们再调用一个方法，用来求平均分，先求总分，再根据总分求平均分
        AverageScore(arr);
        //接下来我们再调用一个方法，用来求最大值
        Max(arr);
    }
    //写一个求及格人数和及格率的方法
    public static void PassRate(double arr[]){
        //接下来我们需要统计及格人数
        //首先定义一个变量，来存储及格人数
        int NumberOfPasses = 0;
        //接下来我们用for循环来判断所有及格的人
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 59){
                NumberOfPasses++;
            }
        }
        //统计完及格人数后我们来计算及格率
        double PassRate = (NumberOfPasses / 10.0 * 1.0);
        System.out.println("及格率为：" + PassRate * 100 + "%");
    }
    //写一个求总分和平均分的方法
    public static void AverageScore(double arr[]){
        //平均分 = 总分 / 总人数
        //我们定义一个变量来求总分
        double Sum = 0;
        //利用for循环来求总分
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
        //求出总分后我们直接输出平均分
        System.out.println("平均分为：" + (Sum / arr.length));
    }
    //写一个用来求最大值的方法
    public static void Max(double arr[]){
        //先定义一个变量用来存放最大值
        double Max = 0;
        //利用for循环来求出最大值
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > Max){
                Max = arr[i];
            }
        }
        //最后输出最大值
        System.out.println("最大值为：" + Max);
    }
}
//78 82 93 54 67 88 79 89 32 66
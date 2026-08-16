//数组算法题
import java.util.Scanner;



public class ArrayAlgo {
    public static void main(String[] args){
        /*需求：已知数组元素为{33，5，22，44，55，33}
        键盘录入任意一个数据，查找这个数据在数组中是否存在
        如果数组中要查找的数据出现多次，只要显示第一次的索引即可
        输出要求：
        如果存在，打印索引
        如果不存在，提示：“该数据不存在”*/

        Scanner sc = new Scanner(System.in);
        int arr [] = {33,5,22,44,55,33};
        //存入用户输入的值num
        int num = sc.nextInt();
        //初始化索引
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("该数据不存在");
        }else{
            System.out.println("索引为：" + index);
        }

    }
}

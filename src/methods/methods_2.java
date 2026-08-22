package methods;

import java.util.Random;

public class methods_2 {
    static void main(String[] args) {
        //先获取10个0-100之间的随机数并存入到数组当中，要求保证数据是唯一的
        //先定义动态数组
        int arr[] = new int[10];

        //生成一下随机数
        Random r = new Random();

        //循环10次
        for (int i = 0; i < arr.length;) {
            //先将生成的随机数存到num变量里面，我们要进行数值的判断
            int num = r.nextInt(10) + 1;
            if(num == 0){
                arr[i] = 0;
                i++;
                continue;
            }
//            int count = 0;
//            for (int i1 = 0; i1 < arr.length; i1++) {
//                if(num == arr[i1]){
//                    count++;
//                    break;
//                }
//            }

            if(!contains(num,arr)){
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    //循环判断方法
    public static boolean contains(int num , int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }

}

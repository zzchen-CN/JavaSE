import java.util.Random;


public class ArrayAlgo_2 {
    public static void main(String[] args){

        /*需求：获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的*/
        //定义动态数组
        int arr[] = new int[10];

        //生成随机数
        Random r = new Random();
        //大循环，意思是我需要生成十个随机数，是根据数组的长度进行生成
        for (int i = 0; i < arr.length;) {
            //将随机数赋值给num
            int num = r.nextInt(100) + 1;
            //需要判断生成的随机数，是否有重复值，所以需要循环判断一下
            int count = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if(num == arr[i1]){
                     count++;
                     break;
                }
            }
            if(count == 0){
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}

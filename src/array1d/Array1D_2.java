package array1d;

//数组遍历
public class Array1D_2 {
    public static void main(String[] args){
         /*int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }*/

        //利用arr.length来获取数组的长度
        int arr2[] = {10,20,30,40,50,60,70,80,90,100};
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("数组长度为：  " + arr2.length);

        //快速遍历数组生成方式
        //数组名.fori + 回车
        System.out.print("快速生成数组：");
        int arr3[] = {11,22,33,44,55,66,77,88,99,111};
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}

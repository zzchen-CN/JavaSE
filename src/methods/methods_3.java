package methods;

public class methods_3 {
    public static void main(String[] args) {
        //定义一个方法遍历数组
        //遍历格式如下
        //[1, 2, 3, 4, 5]

        //1.定义数组
        int arr[] = {1,2,3,4,5};

        //2.调用方法
        printArr(arr);
    }

    public static void printArr(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i] + "]");
            }else System.out.print(arr[i] + ", ");
        }
    }


}

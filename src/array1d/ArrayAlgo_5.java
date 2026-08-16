package array1d;

public class ArrayAlgo_5 {
    public static void main(String[] args){
        /*需求：给你两个有序的数组arr1和arr2
        * 将两个数组中的数据合并到一个大数组中
        * 要求:合并之后的大数组也是有序的*/

        //固定两个数组，我们先将这两个数组中的数都放到第三个数组中
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8,10};
        int arr3[] = new int[10];
        int index = 0;

        for(int i = 0; i < arr1.length; i++){
            arr3[index] = arr1[i];
            index++;
        }
        for(int j = 0; j < arr2.length; j++){
            arr3[index] = arr2[j];
            index++;
        }
        for(int i = 0; i < arr3.length; i++) {
            int indexa = i;
            int min = arr3[i];
            for (int j = (i + 1); j < arr3.length; j++) {
                if (min > arr3[j]) {
                    indexa = j;
                    min = arr3[j];
                }
            }
            int temp;
            temp = min;
            arr3[indexa] = arr3[i];
            arr3[i] = temp;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
    }
}

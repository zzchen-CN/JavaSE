package array1d;

public class ArrayAlgo_3 {
    public static void main(String[] args){
        //需求：给定一个递增有序数字组，去除其中重复元素
        int arr[] = {1,1,2,2,2,2,3,3,3,3};

        //可以用一个叫做快慢指针的方法
        //slow为慢指针
        //fast为快指针
        int slow = 0;
            for (int fast = 1; fast < arr.length; fast++) {
                if(arr[slow] != arr[fast]){
                    slow++;
                    arr[slow] = arr[fast];
                }
            }
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

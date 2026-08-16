import java.util.Scanner;
public class ArrayAlgo_4 {
    public static void main(String[] args){
        //给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的那两个整数，并输出他们的数组索引
        /*例子：输入：数组nums = [2,7,11,15]  target = 9
        *      输出：0,1
        *      解释：因为nums[0] + nums[1] == 9，所以结果为0和1*/
        // 先定义一组动态输入数组
        int arr[] = new int[4];

        //让用户输入数值进去
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要输入的四个数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //还需要用户输入目标值
        System.out.println("请输入目标值：");
        int target = sc.nextInt();

        //输入完成后需要开始循环判断了
        int slow = 0;
        int fast = 1;
        int count = 0;
        while(count == 0){
            if(arr[slow] + arr[fast] == target){
                System.out.println(slow + "," + fast);
                count = 1;
                break;
            }else if(fast == 3){
                slow++;
                fast = (slow + 1);
            }else fast++;
        }
        if(count == 0){
            System.out.println("没有符合的值");
        }


    }
}

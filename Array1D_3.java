import java.util.Scanner;

//数组动态初始化
public class Array1D_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr [] = new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

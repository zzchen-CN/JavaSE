package methods;

public class methods_4 {
    public static void main(String[] args) {
        
        //定义一个方法来打印9*9乘法表
        printMulTable();
    }
    //定义方法打印乘法表
    public static void printMulTable(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}

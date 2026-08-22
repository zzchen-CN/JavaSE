package methods;

public class methods_5 {
    static void main(String[] args) {
        //给定两个长方形，判断哪个长方形的面积更大？

        double len1 = 10.1;
        double width1 = 8.2;

        double len2 = 11.2;
        double width2 = 7.2;

        //将第一个和第二个长方形的长和宽都传入方法中，这样方法可以一直重复用，再将返回的值存入变量中进行比较
        double area1 = getArea(len1,width1);
        double area2 = getArea(len2,width2);

        //比较两个长方形的面积
        if(area1 > area2){
            System.out.println("第一个长方形大");
        }else if(area1 < area2){
            System.out.println("第二个长方形大");
        }else System.out.println("这两个长方形一样大");


    }
    public static double getArea(double len , double width){
        return len * width;
    }
}

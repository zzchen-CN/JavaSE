package array1d;

public class Array1D_1 {
    public static void main(String[] args){
        int AgeArr1[] = {18,19,20};
        int AgeArr2[] = new int[]{21,22,23};

        for(int i = 0; i < 3; i++){
            System.out.print(AgeArr1[i] + ",");
            System.out.println(AgeArr2[i]);
        }

        double HeightArr1[] = new double[]{1.70,1.75,1.82};
        double HeightArr2[] = {1.83,1.85,1.76};

        for(int i = 0; i < 3; i++){
            System.out.print(HeightArr1[i] + ",");
            System.out.println(HeightArr2[i]);
        }

        String NameArr1[] = new String[]{"张三","李四","王五"};
        String NameArr2[] = {"嘉豪","嘉欣","子涵"};

        for(int i = 0; i < 3; i++){
            System.out.print(NameArr1[i] + ",");
            System.out.println(NameArr2[i]);
        }
    }
}

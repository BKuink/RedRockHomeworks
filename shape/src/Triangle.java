import java.util.Scanner;

/**
 * Created by asus-pc on 2016/10/28.
 */
public class Triangle extends Shape{
    double bottomSide;
    double height;

    @Override
    void getBasicAttribute() {
        System.out.println("请输入三角形的底边长度");
        Scanner input1 = new Scanner(System.in);
        bottomSide = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("请输入三角形的底边对应高度");
        height = input2.nextDouble();
    }

    @Override
    double getArea() {
        return bottomSide * height / 2;
    }
}

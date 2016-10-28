import java.util.Scanner;

/**
 * Created by asus-pc on 2016/10/28.
 */
public class Square extends Shape{
    double sideLength;

    @Override
    void getBasicAttribute() {
        System.out.println("请输入正方形的边长");
        Scanner input = new Scanner(System.in);
        this.sideLength = input.nextDouble();
    }

    @Override
    double getArea() {
        return sideLength * sideLength;
    }
}

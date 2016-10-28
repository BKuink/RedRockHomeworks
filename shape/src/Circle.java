import java.util.Scanner;

/**
 * Created by asus-pc on 2016/10/28.
 */
public class Circle extends Shape{
    double radius;

    @Override
    void getBasicAttribute() {
        System.out.println("请输入圆的半径");
        Scanner input = new Scanner(System.in);
        this.radius= input.nextDouble();
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius / 2;
    }
}

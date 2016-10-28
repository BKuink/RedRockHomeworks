import java.util.Scanner;

/**
 * Created by asus-pc on 2016/10/28.
 */
public class Text {
    public static void main(String[] args){
        int choose;
        Scanner inputChoose = new Scanner(System.in);
        System.out.println("请选择你想求面积的图形：1.三角形 2.正方形 3.圆形");
        choose = inputChoose.nextInt();
        if(choose == 1){
            Triangle shape = new Triangle();
            shape.getBasicAttribute();
            System.out.println(shape.getArea());
        }
        if (choose == 2){
            Shape shape = new Square();
            shape.getBasicAttribute();
            System.out.println(shape.getArea());
        }
        if(choose == 3){
            Shape shape = new Circle();
            shape.getBasicAttribute();
            System.out.println(shape.getArea());
        }
    }
}

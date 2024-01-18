import java.math.MathContext;
import java.util.Scanner;
class Circle {
    private double PI = 3.1415;
    private int radius;
    Circle(int newradius) {
        radius = newradius;
    }
    public double getCircumference() {
        return (radius + radius) * PI;
    }
    public double getArea() {
        return radius * radius * PI;
    }
}


class problem11_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値で入力：");
        int num = stdIn.nextInt();
        Circle circle = new Circle(num);
        System.out.println("円周の長さは"+circle.getCircumference()+"です。");
        System.out.println(String.format("円の面積は%.3fです。", Math.floor(circle.getArea()*1000)/1000));
    }

}

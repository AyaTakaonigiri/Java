import java.util.Scanner;
class Circle {

    // フィールド
    // インスタンスの状態を表す変数
    private double PI = 3.1415;
    private int radius;

    // コンストラクタ
    // 半径の定義
    Circle(int newradius) {
        radius = newradius;
    }

    // メソッド
    // 円周の計算
    public double getCircumference() {
        return (radius + radius) * PI;
    }

    // 面積の計算
    public double getArea() {
        return radius * radius * PI;
    }

    public double getAreas() {
        double areas = radius * radius * PI;
        return areas;
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

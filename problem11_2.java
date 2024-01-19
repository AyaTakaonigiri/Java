import java.util.Scanner;
class Sum {

    // フィールド
    // インスタンスの状態を表す変数
    private int x;
    private int y;
    private int sum;

    // コンストラクタ
    // 半径の定義
    //名前はクラス名と合わせる
    Sum(int new_x, int new_y) {
        x = new_x;
        y = new_y;
    }

    // メソッド
    // 合計値の計算
    public int getSum() {
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}


class problem11_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num1 = 100;
        // int num1 = stdIn.nextInt();
        int num2 = 200;
        // int num2 = stdIn.nextInt();
        System.out.print(num1 + "から" + num2 + "までの合計値は");
        Sum a = new Sum(num1, num2);
        System.out.print(a.getSum()+"です。");
    }

}
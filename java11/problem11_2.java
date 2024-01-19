// 合計値はクラス変数
import java.util.Scanner;
class Sum1 {

    // フィールド
    // インスタンスの状態を表す変数
    public int x = 100;
    public int y = 200;
    private int sum;


    // メソッド
    // 合計値の計算
    //クラス変数としてだすのでこっちで処理
    //インスタンス変数はクラスで定義したものを？？？.ｘでもってきてそれをメインで計算する
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
        Sum1 su = new Sum1();
        // int num1 = stdIn.nextInt();
        // int num2 = stdIn.nextInt();
        System.out.print(su.x + "から" + su.y + "までの合計値は");
        System.out.print(su.getSum()+"です。");
    }

}
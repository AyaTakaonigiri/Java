// 合計値はクラス変数
import java.util.Scanner;
class Sum2 {

    // フィールド
    // インスタンスの状態を表す変数
    Scanner stdIn = new Scanner(System.in);
    public int x = stdIn.nextInt();
    public int y = stdIn.nextInt();
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
        Sum2 su = new Sum2();
        System.out.print(su.x + "から" + su.y + "までの合計値は");
        System.out.print(su.getSum()+"です。");
    }

}
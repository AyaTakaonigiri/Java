/* 入力値を扱うためのクラスをインポートする */
import java.util.Scanner;
class problem5_1 {
    public static void main(String[] args) {
        //Scannerのインスタンス化
        Scanner stdIn = new Scanner(System.in);

        System.out.print("A~Dの値を入力してください：");
        /* 入力する文字を変数ｘに代入する */
        String x = stdIn.next();

        /* 入力された文字に分かれて出力を変える */
        switch (x) {
            case "A":
                /* xがＡの場合 */
                System.out.println("ランクAは評価「優」です");
                /* ループから抜け出す */
                break;
            case "B":
                /* xがＢの場合 */
                System.out.println("ランクBは評価「良」です");
                /* ループから抜け出す */
                break;
            case "C":
                /* xがＣの場合 */
                System.out.println("ランクCは評価「可」です");
                /* ループから抜け出す */
                break;
            case "D":
                /* xがＤの場合 */
                System.out.println("ランクDは評価「不可」です");
                /* ループから抜け出す */
                break;
        }
    }
}

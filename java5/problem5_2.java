/* 入力値を扱うためのクラスをインポートする */
import java.util.Scanner;
class problem5_2 {
    public static void main(String[] args) {
        //Scannerのインスタンス化
        Scanner stdIn = new Scanner(System.in);

        System.out.print("クラス番号（１～３）の値を入力してください：");
        /* 入力する文字を変数ｘに代入する */
        String x = stdIn.next();

        /* 入力された文字（ｘ）に分かれて出力を変える */
        switch (x) {
            case "1":
                /* xが１の場合 */
                System.out.println("情報処理コース");
                /* ループから抜け出す */
                break;
            case "2":
                /* xが２の場合 */
                System.out.println("OAビジネスコース");
                /* ループから抜け出す */
                break;
            case "3":
                /* xが３の場合 */
                System.out.println("税理士コース");
                /* ループから抜け出す */
                break;
            default:
                /* xが1~3に一致しない場合 */
                System.out.println("不正な入力です");
                /* ループから抜け出す */
                break;
        }
    }
}

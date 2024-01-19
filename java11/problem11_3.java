import java.util.Scanner;
class Sum2 {

    // フィールド
    // インスタンスの状態を表す変数
    Scanner stdIn = new Scanner(System.in);
    static int x;
    static int y;
    //コンストラクタ
    Sum2() {
        x = stdIn.nextInt();
        y = stdIn.nextInt();
    }
}

class problem11_3 {
    public static void main(String[] args) {
        int sum = 0;
        Sum2 su = new Sum2();
        // インスタンス変数をつくる
        int num1 = Sum2.x;
        int num2 = Sum2.y;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        //インスタンス変数
        System.out.print(num1 + "から" + num2 + "までの合計値は");
        System.out.print(sum+"です。");
    }

}
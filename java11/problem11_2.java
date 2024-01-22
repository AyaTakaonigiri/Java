//クラス変数
import java.util.Scanner;
class Sum1 {

    // フィールド
    static Scanner stdIn = new Scanner(System.in);
    static int x = stdIn.nextInt();
    static int y = stdIn.nextInt();
}

class problem11_2 {
    public static void main(String[] args) {
        int sum = 0;

        int num1 = Sum1.x;
        int num2 = Sum1.y;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        //インスタンス変数
        System.out.print(num1 + "から" + num2 + "までの合計値は");
        System.out.print(sum+"です。");
    }

}
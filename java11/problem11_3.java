// 合計値はインスタンス変数
import java.util.Scanner;
class Sum2 {

    // フィールド
    // インスタンスの状態を表す変数
    Scanner stdIn = new Scanner(System.in);
    public int x;
    public int y;
    public int sum;
    //コンストラクタ
    Sum2() {
        this.x = stdIn.nextInt();
        this.y = stdIn.nextInt();
    }

    int getsum (int x, int y) {
        for (int i = x; i <= y; i++) {
        sum += i;
        }
        return (sum);
    }
}


class problem11_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //インスタンス化
        Sum2 su = new Sum2();
        System.out.print(su.x + "から" + su.y + "までの合計値は");
        
        System.out.print(su.getsum(su.x, su.y)+"です。");
    }

}
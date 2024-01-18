//数値を入力するためにScannerクラスをインストール
import java.util.Scanner;

class kouka {
    // 合計点を求めるメソッド
    static int total_point(int num1, int num2, int num3, int num4, int num5) {
        //合計点の計算
        int sum = num1 + num2 + num3 + num4 + num5;
        //合計点を返す
        return sum;
    }   
    // 平均点を求めるメソッド
    static double average_point(int num1, int num2, int num3, int num4, int num5) {
        //平均点の計算
        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        //平均点を返す
        return avg;
    }

    //メインプログラム
    public static void main(String[] args) {
        //Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        //点数５つ入れる配列の初期化
        int a[] = new int[5];

        //点数の入力
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"教科目の点数を入力してください：");
            int num = stdIn.nextInt();
            //点数が不正でない場合
            if (num >= 0 && num <= 100){
                a[i] = num;
            }
            //点数が不正である場合
            else{
                System.out.println("不正な点数を検知しました。0点とします。");
                a[i] = 0;
            }
        }
        //合計点を計算するメソッドを呼び出し、出力する
        System.out.println("合計点 = " + total_point(a[0], a[1], a[2], a[3], a[4]));
        //平均点を計算するメソッドを呼び出し、出力する
        System.out.println("平均点 = " + average_point(a[0], a[1], a[2], a[3], a[4]));
    }
}

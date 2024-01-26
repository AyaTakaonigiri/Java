package java13.problem13_4;

import java.util.Scanner;

//二つのインターフェイスを実装したクラスCalcExcuterを継承する
public class Main extends CalcExcuter{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //一つ目の整数を入力する
        System.out.print("１個目の整数を入力してください：");
        int num1 = stdIn.nextInt();
        //二つ目の整数を入力する
        System.out.print("２個目の整数を入力してください：");
        int num2 = stdIn.nextInt();
        //継承したクラスをインスタンス化する
        CalcExcuter CE = new CalcExcuter();

        //足し算の結果の表示
        System.out.print("足し算の結果：");
        //入力した二つの整数をdispAddメソッドの引数とする
        System.out.println(CE.dispAdd(num1, num2));

        //引き算の結果の表示
        System.out.print("引き算の結果：");
        //入力した二つの整数をdispSubメソッドの引数とする
        System.out.println(CE.dispSub(num1, num2));

        //掛け算の結果の表示
        System.out.print("掛け算の結果：");
        //入力した二つの整数をdispMultiメソッドの引数とする
        System.out.println(CE.dispMulti(num1, num2));

        //割り算の結果の表示
        System.out.print("割り算の結果：");
        //入力した二つの整数をdispDivメソッドの引数とする
        System.out.println(CE.dispDiv(num1, num2));
    }
}

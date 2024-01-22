package java12;

import java.util.Scanner;

//スーパークラス
class Calculator {
    //二つの引数の合計値を返すメソッド
    public int CalcSum(int x, int y) {
        return (x + y);
    }

    //二つの引数の平均値を返すメソッド
    public double CalcAve(int x, int y) {
        return (Math.floor((x + y)*10/2)/10);
    }
}

//サブクラス
class MoreCalc extends Calculator {
    //累乗の結果を表す変数の初期化
    private int result = 1;

    //メソッド
    public int CalcPow(int x, int y) {
        //累乗の計算
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        //累乗の結果を返す
        return result;
    }
}

class problem12_1 {
    public static void main(String[] args) {
    MoreCalc MC = new MoreCalc();
    Scanner stdIn = new Scanner(System.in); 
    System.out.print("整数を入力してください："); 
    int x = stdIn.nextInt();
    System.out.print("整数を入力してください："); 
    int y = stdIn.nextInt();
    System.out.print("Sum "+ x + " and " + y + " = ");
    System.out.println(MC.CalcSum(x, y));
    System.out.print("Average "+ x + " and " + y + " = ");
    System.out.println(MC.CalcAve(x, y)); 
    System.out.print("Power "+ x + " of " + y + " = ");
    System.out.println(MC.CalcPow(x, y));    
    }
    
}
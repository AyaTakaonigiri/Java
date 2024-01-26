package java15;

import java.util.Scanner;

class problem15_1 {
    public static void main(String[] args) {
        //２つの整数を入力する
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数１＝");
        int num1 = stdIn.nextInt();
        System.out.print("整数２＝");
        int num2 = stdIn.nextInt();
        try{
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
        }
        //例外（０で割った場合）
        catch(ArithmeticException e) {
            System.out.println("0による割り算です！！");
        }
        //例外の有無にかかわらず表示させる文章
        finally {
            System.out.println("処理終了");
        }
    }    
}
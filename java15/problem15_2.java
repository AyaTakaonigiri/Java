package java15;

import java.util.InputMismatchException;
import java.util.Scanner;

class problem15_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //入力される数字が整数か小数かで分ける
        try {
            System.out.print("整数を入力＝");
            int num = stdIn.nextInt();
            //入力された整数が奇数の時の処理
            if (num % 2 == 1) {
                System.out.println(num + "は奇数");
            }
            //入力された整数が偶数の時の処理
            else if (num % 2 == 0) {
                System.out.println(num + "は偶数");
            }
        }
        //int型には小数は入らないので例外処理となる
        catch(InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        }

        
    }
}

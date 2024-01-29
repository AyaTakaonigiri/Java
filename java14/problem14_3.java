package java14;

import java.util.Scanner;

class problem14_3 {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in, "SHIFT-JIS");
            System.out.print("文字列を入力：");
            //この書き方だと文字列の長さに１６を加えた容量の文字ビルダが構築される
            StringBuilder text = new StringBuilder(stdIn.next());
            if (text.length() > 10) {
                System.out.print("結果文字列：");
                System.out.println(text.delete(10, text.length()));
            }
            else {
                System.out.print("結果文字列：");
                System.out.println(text);
            }
        }
}

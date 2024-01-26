package java14;

import java.util.Scanner;

//文字列を入力し、画面にその文字列を表示する。
class problem14_1 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力");
        String str = stdIn.next();
        System.out.print(str);

    }
}

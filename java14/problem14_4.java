package java14;

import java.util.Scanner;

class problem14_4 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in, "SHIFT-JIS");
        System.out.print("１つ目文字列を入力：");
        String str1 = stdIn.next();
        System.out.print("２つ目文字列を入力：");
        String str2 = stdIn.next();
        if (str1.equals(str2)) {
            System.out.println("同じ文字列です。");
        }
        else {
            System.out.println("違う文字列です。");
        }
    }
}

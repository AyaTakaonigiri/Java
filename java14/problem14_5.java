package java14;

import java.util.Scanner;

class problem14_5 {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in, "SHIFT-JIS");

            System.out.print("内容１：");
            StringBuilder str1 = new StringBuilder(stdIn.nextLine());
            System.out.print("内容２：");
            StringBuilder str2 = new StringBuilder(stdIn.nextLine());
            System.err.println();
            System.out.println(str1.append(str2));

        }
}

package java14;

import java.util.Scanner;

class problem14_5 {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in, "SHIFT-JIS");

            StringBuilder str = new StringBuilder();

            System.out.print("内容１：");
            String str1 = stdIn.nextLine();
            System.out.print("内容２：");
            String str2 = stdIn.nextLine();
            System.err.println();
            str.append(str1);
            System.out.println(str.append(str2));

        }
}

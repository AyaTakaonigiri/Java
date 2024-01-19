import java.util.Scanner;

class problem4_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0~100までの得点（整数値）を2つ入力してください");
        System.out.print("国語の得点：");
        int num = stdIn.nextInt();
        System.out.print("英語の得点：");
        int num2 = stdIn.nextInt();
        if (num >= 80) {
            if (num2 >= 80) {
                System.out.println("2教科とも合格です");
            }
        }
    }
}

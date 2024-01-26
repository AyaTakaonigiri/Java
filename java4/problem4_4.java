import java.util.Scanner;

public class problem4_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0~100までの得点（整数値）を2つ入力してください");
        System.out.print("1つ目の得点：");
        int num = stdIn.nextInt();
        System.out.print("2つ目の得点：");
        int num2 = stdIn.nextInt();
        if (num >= 80 || num2 >= 80) {
                System.out.println("合格です");
        }
    }    
}

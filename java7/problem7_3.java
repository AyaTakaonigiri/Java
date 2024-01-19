import java.util.Scanner;
class problem7_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値を入力：");
        int x;
        x = stdIn.nextInt();
        do {
            System.out.print(x % 10);
            x /= 10;
        } while (x > 0);
    }
}

import java.util.Scanner;

class problem6_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("長方形を描画します。");
        System.out.println("2~20までの整数値を入力してください。");
        System.out.print("行数の入力：");
        int n = stdIn.nextInt();
        if (n >= 2 && n <= 20) {
            System.out.print("列数の入力：");
            int m = stdIn.nextInt();
            if (m >= 2 && m <= 20) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++)
                        System.out.print('*');
                    System.out.println();
                }
            }
            else {
                System.out.println("値が正しくありません。");
            }
        }
        
        
        
        else {
            System.out.println("値が正しくありません。");
        }
    }
}
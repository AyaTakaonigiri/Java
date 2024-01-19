import java.util.Scanner;
class problem6_6{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        int y;
        int z = 0;
 

        System.out.print("開始数：");
        x = stdIn.nextInt();
        System.out.print("終了数：");
        y = stdIn.nextInt();
        for (int i = 0; x <= y; x++) {
            z = z + x;
        }
        System.out.println("合計：" + z);

    }
}
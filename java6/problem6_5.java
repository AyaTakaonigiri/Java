import java.util.Scanner;
class problem6_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("入力文字列：");
        String n = stdIn.next();
        int x = n.length() - 1; //0~4文字は５文字
        for (int i = 0; i <= x; i++) {
            System.out.println(n.charAt(i));
        }
    }
}

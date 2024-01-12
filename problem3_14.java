import java.util.Scanner;
class problem3_14{
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.print("縦の長さ：");
        int vertical = stdIn.nextInt(); //文字列を読み込む
        System.out.print("横の長さ：");
        int horizontal = stdIn.nextInt(); //数列を読み込む
        float area = vertical * horizontal;

        System.out.println("長方形の面積 = " + (area));
    }
}
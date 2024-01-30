import java.util.Scanner;

class problem3_17 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("台形の面積を求めます");
        
        System.out.print("上底の長さ：");
        double upper = stdin.nextInt();

        System.out.print("下底の長さ：");
        double bottom = stdin.nextInt();

        System.out.print("高さ：");
        double height = stdin.nextInt();
        
        double area = (upper + bottom) * height / 2;

        System.out.print("台形の面積 = ");
        System.out.println(area);

    }
}

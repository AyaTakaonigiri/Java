import java.util.Scanner;

public class problem3_16 {
    public static void main(String[] args) {
        System.out.println("円の面積を求めます");
        System.out.print("半径：");
        Scanner stdIn = new Scanner(System.in);
        int radius = stdIn.nextInt();
        double PI = 3.14159;
        System.out.println("円の面積 = "+(radius*radius*PI));
    }

}

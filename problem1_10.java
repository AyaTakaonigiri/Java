import java.util.Scanner;
class problem1_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.print("文字の入力：");
        String str = stdIn.next(); //文字列を読み込む
        System.out.print("整数の入力：");
        int number = stdIn.nextInt(); //数列を読み込む
        System.out.print("小数の入力：");
        float decimal = stdIn.nextFloat(); //小数を読み込む
        
        System.out.println("入力された文字＝"+str);
        System.out.println("入力された文字＝"+number);
        System.out.println("入力された文字＝"+decimal);
    }
}
import java.util.Scanner;
class problem1_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.print("年：");
        int year = stdIn.nextInt(); //文字列を読み込む
        System.out.print("月：");
        int month = stdIn.nextInt(); //数列を読み込む
        System.out.print("日：");
        int date = stdIn.nextInt(); //小数を読み込む
        
        System.out.println(year+"/"+month+"/"+date);
    }
}
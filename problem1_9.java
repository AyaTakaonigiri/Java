import java.util.Scanner;
class problem1_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.print("お名前を入力してください＞");
        String str = stdIn.next(); //文字列を読み込む

        System.out.println("こんにちは" + str + "さん！");
    }
}
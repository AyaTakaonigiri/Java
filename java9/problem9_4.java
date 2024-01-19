import java.util.Scanner;
class problem9_4 {
    static int sanbai(int num) {
        int answer = num * 3;
        return answer;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();
        int numsanbai = sanbai(num);
        int numkyubai = sanbai(numsanbai);
        System.out.println(num + "の9倍は" + numkyubai + "です。");
    }
}

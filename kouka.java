import java.util.Scanner;

class kouka {
    static int total_point(int num1, int num2, int num3, int num4, int num5) {
        int sum = 0;
        sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }   
    static double average_point(int num1, int num2, int num3, int num4, int num5) {
        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        return avg;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"教科目の点数を入力してください：");
            int num = stdIn.nextInt();
            if (num >= 0 && num <= 100){
                a[i] = num;
            }
            else{
                System.out.println("不正な点数を検知しました。0点とします。");
                a[i] = 0;
            }
        }
        System.out.println("合計点 = " + total_point(a[0], a[1], a[2], a[3], a[4]));
        System.out.println("平均点 = " + average_point(a[0], a[1], a[2], a[3], a[4]));
    }
}

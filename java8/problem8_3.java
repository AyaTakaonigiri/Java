import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class problem8_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        List<Integer> kisu = new ArrayList<>();
        List<Integer> gusu = new ArrayList<>();
        for (int kaisu = 1; kaisu < 11; ++kaisu) {
            System.out.print(kaisu + "件目：整数を入力 = ");
            int a = stdIn.nextInt();

            if (a % 2 == 1 || a % 2 == -1){
                kisu.add(a);
            }
                
            else if (a % 2 == 0) {
                gusu.add(a);
            }
        }
        System.out.print("偶数配列 = ");
        System.out.println((gusu));
        System.out.print("奇数配列 = ");
        System.out.println((kisu));
        
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class test {
      public static void main(String[] args) {
        int a[] = new int[5];//５個の要素が入るリストを作る
        System.out.println(a[0]);

        for (int b : a){//aの中の要素を順番にbに代入(?)して取り出す
            System.out.println(b);
        }


        Scanner stdIn = new Scanner(System.in);
        List<Integer> kisu = new ArrayList<>();
        List<Integer> gusu = new ArrayList<>();
        for (int kaisu = 1; kaisu < 11; ++kaisu){
            if (kaisu % 2 == 1){

                System.out.print(kaisu + "件目：整数を入力 = ");
                int c = stdIn.nextInt();
                kisu.add(c);
            }
                
            else if (kaisu % 2 == 0) {
                System.out.print(kaisu + "件目：整数を入力 = ");
                int b = stdIn.nextInt();
                gusu.add(b);
            }
        }
        System.out.print("偶数配列 = ");
        System.out.println((gusu));
        System.out.print("奇数配列 = ");
        System.out.println((kisu));

      }  
}

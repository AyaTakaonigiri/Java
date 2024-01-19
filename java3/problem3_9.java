/* 任意の入力をするために必要
import java.util.Scanner;
*/
class problem3_9 {
    public static void main(String[] args) {
        
        /* 半径の指定 */
        int x = 3;
  
        /*  任意の半径を入力する場合
        Scanner stdIn = new Scanner(System.in);
        int x;
        x =  stdIn.nextInt();
        */

        /* 円周率の指定 */
        double pai = 3.14;

        /* 面積を計算して表示 */
        System.out.println(x * x * pai);
    }    
}

import java.util.Scanner; //入力値を実装するためのクラスをインポートする
class problem8_8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        /* 要素数が３つの配列を作る */
        int a[] = new int[3];
        
        System.out.println("整数値を３つ入力してください。");
        
        for (int i = 0; i < 3; i++) {
            /* 配列に入れる値を入力する（１つ目） */
            System.out.print(i+1 + "つ目の整数値：");
            int x = stdIn.nextInt();
            /* 値を配列に格納する */
            a[i] = x;
        }
/* 
        /* 配列に入れる値を入力する（１つ目） 
        System.out.print("１つ目の整数値：");
        int x = stdIn.nextInt();
        /* 値を配列に格納する 
        a[0] = x;
        
        /* 配列に入れる値を入力する（２つ目） 
        System.out.print("２つ目の整数値：");
        int y = stdIn.nextInt();
        /* 値を配列に格納する 
        a[1] = y;

        /* 配列に入れる値を入力する（３つ目） 
        System.out.print("３つ目の整数値：");
        int z = stdIn.nextInt();
        /* 値を配列に格納する 
        a[2] = z;
*/

        /* 最大値を求める */
        int maxNum = a[0]; 
        for (int j : a) {
        if (j > maxNum)
            maxNum = j;
        }

        /* 最小値を求める */
        int minNum = a[0];
        for (int l : a) {
        if (l < minNum)
            minNum = l;
        }

        /* 最大値、最小値を表示する */
        System.out.println("最大値："+maxNum);
        System.out.println("最小値："+minNum);
        

    }
}
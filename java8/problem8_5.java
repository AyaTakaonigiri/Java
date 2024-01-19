import java.util.Arrays;//配列を全部表示する時に使うクラスをインポートする
class problem8_5 {
        public static void main(String[] args) {
            /* 任意の配列を作る */
            int x[] = {1, 2, 3, 4, 5};
            /* 合計値を表す変数sumを初期化 */
            int sum = 0;
            /* 平均値を表す変数avgを初期化 */
            float avg = 0;

            /* 配列の中の数字の合計を求める */
            for (int i = 0; i < x.length; i++) {
                sum += x[i];
            }
            
            /* 合計値を配列の要素数で割って平均値を求める */
            avg = sum / x.length;

            /* 配列の表示 */
            System.out.println("配列が"+Arrays.toString(x)+"の場合");
            /* 合計値の表示 */
            System.out.println("合計値は"+sum+"です。");
            /* 平均値の表示 */
            System.out.println("平均値は"+avg+"です。");
        }
}

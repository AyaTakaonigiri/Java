class problem7_4 {
    public static void main(String[] args) {
        /* 加算する変数nを初期化 */
        int n = 0;
        /* 合計値の変数mを初期化 */
        int sum = 0; 
        /* 合計が１０００００を超えるまで加算していく */
        while (sum < 100000) {
            /* 合計値を計算する */
            sum += n;
            /* １０００００を超えていなければ加算する数を１増やす
             */
            if (sum < 100000) {
                ++n;
            }
        }
        /* 合計値を出力する */
        System.out.println("合計が100000を超えるnは"+n+"です");
    }
}
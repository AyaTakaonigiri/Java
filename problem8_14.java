import java.util.*;//マップを使う時に使う
class problem8_14 {
    public static void main(String[] args) {
        /* ハッシュマップをインスタンス化  */
        Map<String, String> map = new HashMap<String, String>();
        
        /* 連想配列を作成 */
        map.put("野菜　　","季節");
        map.put("キャベツ","春");
        map.put("スイカ　","夏");
        map.put("ナス　　","秋");
        map.put("ハクサイ","冬");
        
        
        /* for文で配列の要素を出力する */
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

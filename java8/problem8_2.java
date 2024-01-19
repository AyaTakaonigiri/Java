import java.util.ArrayList;
import java.util.List;

class problem8_2 {
        public static void main(String[] args) {
            //ArrayListのインスタンス化
            List<String> list = new ArrayList<>();
            list.add("茨城県");
            list.add("栃木県");
            list.add("群馬県");
            list.add("千葉県");
            list.add("東京都");
            list.add("埼玉県");
            list.add("神奈川県");

            for (int i = 0; i < list.size(); ++i) {
                System.out.println(list.get(i));
            }
        }
        


}

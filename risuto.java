import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class risuto {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        for (int i = 0; i < array.size(); i++ ) {
            sum += array.get(i);
        }
        /* 文字列のformatの書き方 */
        System.out.println(String.format("合計値は%dです", sum));
    }
}
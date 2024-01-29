import java.util.ArrayList;
import java.util.List;

public class problem9_13 {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(24);
        list.add(45);
        list.add(69);
        list.add(22);
        list.add(44);
        list.add(51);
        list.add(90);
        list.add(78);
        
        finalSample(list);
    }
     
    public static void finalSample(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                System.out.println(list.get(i));
            }
        }
    }
    
}

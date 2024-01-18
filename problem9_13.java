import java.util.ArrayList;
import java.util.List;

public class problem9_13 {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        
        finalSample(list);
        System.out.println(list);
    }
     
    public static void finalSample(final List<String> list) {
        list.set(0, "A");
        list.set(1, "B");
        list.set(2, "C");
    }
    
}

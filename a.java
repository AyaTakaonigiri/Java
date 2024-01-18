import java.util.ArrayList;
import java.util.HashMap;

class a {
    public static void main(String[] args) {
        int num1 = 10;

        int num2 = 3;

        double num3, num4;
        int num5;

        num3 = (double)num1/(double)num2;

        num4 = 3.1415;
        num5 = 12;
        
        System.out.println(num3);
        System.out.println(num4);
        for (int i = 0; num1 < num5;){
            System.out.println("1");
            num1++;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println(list.get(0));

        HashMap<String, Integer> map = new HashMap<>();
        map.put("強盗", 34);
        for (String name :map.keySet()) {
            System.out.println(map.get(name));
        }
            System.out.println(map);
    }    
}

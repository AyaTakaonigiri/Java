package java2;


public class problem2_2 {
    public static void main(String[] args) {
        
    
        double a = 10.0;
        String b = "10";
        String c = "十";

        try {
            System.out.println((int)a);
        }
        catch(Exception e) {
            System.out.println("変換不可");
        }
        try {
            int number = Integer.parseInt(b);
            System.out.println(number);
        }
        catch(Exception e) {
            System.out.println("変換不可");
        }
        try {
            int number = Integer.parseInt(c);
            System.out.println(number);
        }
        catch(Exception e) {
            System.out.println("変換不可");
        }
    }
}

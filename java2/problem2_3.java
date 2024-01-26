package java2;

public class problem2_3 {
    public static void main(String[] args) {
    
    int a = 100;
    double b = 100.0;
    int c = -100;
    
    try {
        System.out.println(String.valueOf(a));
    }
    catch(Exception e) {
        System.out.println("変換不可");
    }
    try {
        System.out.println(String.valueOf(b));
    }
    catch(Exception e) {
        System.out.println("変換不可");
    }
    try {
        System.out.println(String.valueOf(c));
    }
    catch(Exception e) {
        System.out.println("変換不可");
    }

    }
}

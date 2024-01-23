import java.util.*;

public class techful {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1;
        int count2;
        while(true) {
            LABEL:for (int i = 0; i <= 1000; i++) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-'){
                    break LABEL;
                }
            }
        }
    }
}    


import java.util.Arrays;
class problem8_1 {
        public static void main(String[] args) {
            int x[] = new int[10];

            for (int i = 0; i < x.length; ++i) {
                x[i] = i+1;
            }
            for (int l = 0; l < x.length; ++l) {
                System.out.println("list["+l+"] = "+x[l]);
            }


    
        }
        
}

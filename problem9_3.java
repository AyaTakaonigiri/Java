class problem9_3 {
    static void pRint(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }    
    public static void main(String[] args) {
        pRint("hello", 3);
        pRint("Good morning", 6);
    }
}

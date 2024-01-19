class problem7_1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        while (x <= 100) {
            y = y + x;
            ++x;
        }
        System.out.println("合計：" + y);
    }    
}

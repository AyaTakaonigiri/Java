class problem7_2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        do {
            y = y + x;
            ++x;
        } while(x <= 100);
        System.out.println("合計：" + y);
    }
}
